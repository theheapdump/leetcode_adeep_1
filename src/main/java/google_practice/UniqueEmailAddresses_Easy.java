package google_practice;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses_Easy {

    public int numUniqueEmails(String[] emails) {
        int c = 0;
        Set<String> localNameSet = new HashSet<>();
        Set<String> domainNameSet = new HashSet<>();
        // For each email
        for (String email : emails) {
            // if empty ignore
            if (email.trim().isEmpty())
                continue;
            String[] emailSplit = email.split("@");
            String localName = emailSplit[0];
            String domainName = emailSplit[1];
            // Replace all dots in localname with nothing
            localName = localName.replaceAll("\\.", "");
            // If localname has plus - ignore everything after first plus
            if (localName.indexOf("+") != -1)
                localName = localName.substring(0, localName.indexOf("+"));
            // If localname not already used or if localname already used but domain name not used
            // incrememnt count
            if (!localNameSet.contains(localName) ||
                    localNameSet.contains(localName) && !domainNameSet.contains(domainName))
                c++;
            // update data structures
            localNameSet.add(localName);
            domainNameSet.add(domainName);
        }
        return c;
    }
}
