package jmdb.spikes.mongodb;

import java.util.HashMap;
import java.util.Map;

public class DataGenerator {
    private static String STATIC_GANGSTA = "Lorizzle ipsizzle break it down sizzle amizzle, brizzle adipiscing elit. Nullam sapien velit, aliquet volutpizzle, suscipizzle quis, gravida vizzle, arcu. Pellentesque things for sure. I'm in the shizzle erizzle. Fusce bling bling fo shizzle dapibizzle turpis crunk. Maurizzle da bomb nibh izzle turpizzle. Crazy shit tortor. Pellentesque eleifend rhoncus dang. In hac habitasse platea dictumst. Ma nizzle dapibizzle. Curabitizzle tellus dizzle, mammasay mammasa mamma oo sa go to hizzle, mattis fizzle, eleifend vitae, uhuh ... yih!. Dawg for sure. Integizzle semper my shizz sizzle yippiyo.\n" +
            "\n" +
            "Phasellus interdum volutpizzle tellizzle. Ut rizzle adipiscing lorem. Donizzle its fo rizzle est. Nulla sapizzle i saw beyonces tizzles and my pizzle went crizzle, phat nizzle, accumsizzle doggy, fermentum you son of a bizzle, pede. Duis nizzle gangsta. Etizzle mofo check out this ante. Maurizzle izzle. Crazy izzle pede dope nibh ghetto commodo. Lorem yo dolizzle sizzle go to hizzle, fo shizzle mofo elit. Sizzle izzle mi. Owned mi ma nizzle, sodales izzle, shizzle my nizzle crocodizzle a, eleifend a, daahng dawg.\n" +
            "\n" +
            "Donizzle posuere auctizzle mauris. Phasellus check it out dawg shiznit nibh pretizzle tincidunt. Daahng dawg a erat. Fo shizzle mah nizzle fo rizzle, mah home g-dizzle fizzle lacus sizzle mauris doggy tristique. Nunc at gangsta sit ass erizzle fo shizzle porta. In shut the shizzle up tortor, ultricizzle izzle, daahng dawg quis, mofo quizzle, dui. Pimpin' break it down leo, aliquizzle fo shizzle, pharetra nizzle, bling bling dizzle, turpizzle. Break yo neck, yall neque. Boofron lorizzle. Proin vitae own yo' izzle libero commodo adipiscing. Fusce izzle augue bling bling ullamcorpizzle mattis. Phasellus fermentum fo shizzle mah nizzle fo rizzle, mah home g-dizzle bling bling erat. Suspendisse fo shizzle my nizzle tellivizzle, pizzle shizzle my nizzle crocodizzle, mattizzle izzle, ma nizzle nizzle, justo. Donec fo shizzle porttitizzle crackalackin. Nunc feugiat, ass fo ornare tempor, sapien fizzle tincidunt yo mamma, egizzle that's the shizzle pede break it down dope lorizzle. Phasellizzle boom shackalack leo, imperdiet break yo neck, yall, tempizzle ut, shiz in, sapien. Ut mollizzle magna fizzle doggy. Sed bling bling nibh, shiz vitae, vestibulum et, rutrum pot, velizzle. Bling bling a mauris. Dope pimpin' magna sit amet pot iaculis doggy.\n" +
            "\n" +
            "Praesent you son of a bizzle nisi quis justo da bomb molestie. Uhuh ... yih! ligula get down get down, dapibizzle izzle, fizzle owned, fo shizzle my nizzle izzle, owned. Pizzle sure. Suspendisse consectetuer. Yippiyo fo shiznit, luctizzle crunk, bibendizzle nec, bibendizzle fo, dolor. Funky fresh sizzle dolor. Sheezy vel tortor. Uhuh ... yih! at nibh. Vestibulizzle consequat. Donizzle pot sapizzle vel arcu. Boofron a crunk vel shit eleifend eleifend. Fusce pulvinar, sizzle sure shiznit fringilla, neque we gonna chung tempizzle cool, vehicula elementum augue gangster lacinia funky fresh. Yippiyo vestibulum sodalizzle dolor. Aliquizzle erizzle volutpizzle. Funky fresh sagittizzle, own yo' funky fresh ultricies consequizzle, its fo rizzle brizzle bling bling elizzle, at shizzlin dizzle for sure metizzle sed fo shizzle my nizzle.\n" +
            "\n" +
            "Daahng dawg dope ligula. Aliquizzle fo shizzle mah nizzle fo rizzle, mah home g-dizzle commodo tellus. Ma nizzle yo mamma, sapizzle izzle ma nizzle daahng dawg, libero urna daahng dawg leo, non you son of a bizzle shut the shizzle up sapien at dawg. Donizzle shizzle my nizzle crocodizzle i saw beyonces tizzles and my pizzle went crizzle. Shizzlin dizzle quizzle i saw beyonces tizzles and my pizzle went crizzle. Sizzle elementum faucibizzle check out this. Integer fo shizzle sizzle, crackalackin izzle, volutpat egizzle, boofron egizzle, nunc. Sizzle phat. Nunc yo. Fo shizzle mah nizzle fo rizzle, mah home g-dizzle sit amet mammasay mammasa mamma oo sa nec shizzle my nizzle crocodizzle blandit sizzle. Pizzle funky fresh yo boom shackalack funky fresh i'm in the shizzle. Sizzle tempus dignissim dawg.\n" +
            "\n" +
            "Vivamizzle tempizzle things ac sizzle. Pellentesque izzle da bomb izzle sheezy dapibizzle my shizz. Etizzle auctizzle pharetra ass. Aliquizzle bow wow wow feugizzle own yo'. Aliquam shut the shizzle up volutpizzle. Phat tellivizzle ghetto its fo rizzle. We gonna chung that's the shizzle pimpin' izzle nunc. Aenizzle a maurizzle. Things gangster justo, molestie mofo, mollizzle my shizz, molestie shiz, mi. Nulla sure tellivizzle izzle fo shizzle mah nizzle fo rizzle, mah home g-dizzle yippiyo consequizzle. Integizzle doggy erizzle. Cras brizzle. Morbi nisi sheezy, auctizzle vel, go to hizzle fo shizzle, malesuada boofron, nibh. Pellentesque dapibus check out this mi. Fo shizzle crazy orci, aliquizzle quizzle, crazy izzle, euismizzle shiz, black. Funky fresh leo. My shizz izzle sapien izzle sure sempizzle mattis. Nizzle fizzle yippiyo, facilisizzle da bomb, shizzlin dizzle eu, adipiscing the bizzle, its fo rizzle.";

    public static Map<String, Object> nextContact() {
        return new HashMap<String, Object>() {{
            put("name", "jimbob");
            put("address", "jimbob farms");
            put("postcode", "DF4 5EW");
            put("dateOfBirth", "12/4/1956");
            put("someText", STATIC_GANGSTA);
        }};
    }
}