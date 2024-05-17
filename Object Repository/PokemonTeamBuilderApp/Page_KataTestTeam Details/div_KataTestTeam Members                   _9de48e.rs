<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_KataTestTeam Members                   _9de48e</name>
   <tag></tag>
   <elementGuidId>2b3327d2-d6dc-4ad3-8e08-e1acca3f9c2c</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='content-wrap']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#content-wrap</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>09503958-19c4-4064-94f2-a78722de2fe3</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>content-wrap</value>
      <webElementGuid>2b89069d-fc94-462f-a58b-4957735dee24</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                

KataTestTeam Members
    
        
            Edit
             
            
            Delete
            
        
        Export as JSON
        Export as CSV
        Export for Pokemon Showdown
    
    
        
            
                 
                68 
                machamp |
                fighting,fighting |
                guts
                 
                    
                        headbutt 
                    
                    
                        headbutt 
                    
                    
                        headbutt 
                    
                    
                        headbutt 
                    
                
                
            
        
        
            
                 
                612 
                haxorus |
                dragon,dragon |
                unnerve
                 
                    
                        swords-dance 
                    
                    
                        swords-dance 
                    
                    
                        swords-dance 
                    
                    
                        swords-dance
                    
                
                
            
        
        
            
                 
                448 
                lucario |
                fighting,steel |
                inner-focus
                 
                    
                        swords-dance 
                    
                    
                        swords-dance 
                    
                    
                        swords-dance 
                    
                    
                        swords-dance
                    
                
                
            
        
        
            
                 
                9 blastoise |
                water,water |
                torrent
                 
                    
                        headbutt
                     
                    
                        headbutt
                    
                    
                        headbutt
                    
                    
                        headbutt
                    
                
                
            
        
        
            
                
                230 
                kingdra |
                dragon,water |
                sniper
                 
                    
                    headbutt 
                    
                    
                    headbutt 
                    
                    
                    headbutt 
                    
                    
                    headbutt
                    
                
                
            
        
        
            
                 
                257 
                blaziken |
                fire,fighting |
                blaze
                
                    
                    swords-dance
                    
                    
                    swords-dance
                    
                    
                    swords-dance
                    
                    
                    swords-dance
                    
                
                
            
        
    
    Back to teams
    Back to community





    document.querySelectorAll('.delete-btn').forEach(button => {
        button.addEventListener('click', event => {
            const confirmDelete = confirm('Are you sure you want to delete this team?');
            if (confirmDelete) {
                const formID = this.parentNode.id;
                const form = document.getElementById(formID);
                form.submit();
            }
            else {
                event.preventDefault();
            }
        });
    });


            </value>
      <webElementGuid>75a38d99-b505-4ff6-890b-7059b038de65</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;content-wrap&quot;)</value>
      <webElementGuid>4ef16331-7398-423c-bc3c-0e4e6a7dc666</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='content-wrap']</value>
      <webElementGuid>3876d850-b005-4709-b6bf-5a10909eb41a</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='page-container']/div</value>
      <webElementGuid>a3b54d4e-65d5-4c62-93a0-11bc1cb15722</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='LOGOUT'])[1]/following::div[1]</value>
      <webElementGuid>043adcc9-e53c-46a9-a3ea-f746b7ccf476</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='PROFILE'])[1]/following::div[1]</value>
      <webElementGuid>f7779b50-c45a-4ba1-a2bd-fae22890e964</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div</value>
      <webElementGuid>d72bd641-7b43-4b05-bfe6-860c1c8c52b6</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[@id = 'content-wrap' and (text() = concat(&quot;
                

KataTestTeam Members
    
        
            Edit
             
            
            Delete
            
        
        Export as JSON
        Export as CSV
        Export for Pokemon Showdown
    
    
        
            
                 
                68 
                machamp |
                fighting,fighting |
                guts
                 
                    
                        headbutt 
                    
                    
                        headbutt 
                    
                    
                        headbutt 
                    
                    
                        headbutt 
                    
                
                
            
        
        
            
                 
                612 
                haxorus |
                dragon,dragon |
                unnerve
                 
                    
                        swords-dance 
                    
                    
                        swords-dance 
                    
                    
                        swords-dance 
                    
                    
                        swords-dance
                    
                
                
            
        
        
            
                 
                448 
                lucario |
                fighting,steel |
                inner-focus
                 
                    
                        swords-dance 
                    
                    
                        swords-dance 
                    
                    
                        swords-dance 
                    
                    
                        swords-dance
                    
                
                
            
        
        
            
                 
                9 blastoise |
                water,water |
                torrent
                 
                    
                        headbutt
                     
                    
                        headbutt
                    
                    
                        headbutt
                    
                    
                        headbutt
                    
                
                
            
        
        
            
                
                230 
                kingdra |
                dragon,water |
                sniper
                 
                    
                    headbutt 
                    
                    
                    headbutt 
                    
                    
                    headbutt 
                    
                    
                    headbutt
                    
                
                
            
        
        
            
                 
                257 
                blaziken |
                fire,fighting |
                blaze
                
                    
                    swords-dance
                    
                    
                    swords-dance
                    
                    
                    swords-dance
                    
                    
                    swords-dance
                    
                
                
            
        
    
    Back to teams
    Back to community





    document.querySelectorAll(&quot; , &quot;'&quot; , &quot;.delete-btn&quot; , &quot;'&quot; , &quot;).forEach(button => {
        button.addEventListener(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, event => {
            const confirmDelete = confirm(&quot; , &quot;'&quot; , &quot;Are you sure you want to delete this team?&quot; , &quot;'&quot; , &quot;);
            if (confirmDelete) {
                const formID = this.parentNode.id;
                const form = document.getElementById(formID);
                form.submit();
            }
            else {
                event.preventDefault();
            }
        });
    });


            &quot;) or . = concat(&quot;
                

KataTestTeam Members
    
        
            Edit
             
            
            Delete
            
        
        Export as JSON
        Export as CSV
        Export for Pokemon Showdown
    
    
        
            
                 
                68 
                machamp |
                fighting,fighting |
                guts
                 
                    
                        headbutt 
                    
                    
                        headbutt 
                    
                    
                        headbutt 
                    
                    
                        headbutt 
                    
                
                
            
        
        
            
                 
                612 
                haxorus |
                dragon,dragon |
                unnerve
                 
                    
                        swords-dance 
                    
                    
                        swords-dance 
                    
                    
                        swords-dance 
                    
                    
                        swords-dance
                    
                
                
            
        
        
            
                 
                448 
                lucario |
                fighting,steel |
                inner-focus
                 
                    
                        swords-dance 
                    
                    
                        swords-dance 
                    
                    
                        swords-dance 
                    
                    
                        swords-dance
                    
                
                
            
        
        
            
                 
                9 blastoise |
                water,water |
                torrent
                 
                    
                        headbutt
                     
                    
                        headbutt
                    
                    
                        headbutt
                    
                    
                        headbutt
                    
                
                
            
        
        
            
                
                230 
                kingdra |
                dragon,water |
                sniper
                 
                    
                    headbutt 
                    
                    
                    headbutt 
                    
                    
                    headbutt 
                    
                    
                    headbutt
                    
                
                
            
        
        
            
                 
                257 
                blaziken |
                fire,fighting |
                blaze
                
                    
                    swords-dance
                    
                    
                    swords-dance
                    
                    
                    swords-dance
                    
                    
                    swords-dance
                    
                
                
            
        
    
    Back to teams
    Back to community





    document.querySelectorAll(&quot; , &quot;'&quot; , &quot;.delete-btn&quot; , &quot;'&quot; , &quot;).forEach(button => {
        button.addEventListener(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, event => {
            const confirmDelete = confirm(&quot; , &quot;'&quot; , &quot;Are you sure you want to delete this team?&quot; , &quot;'&quot; , &quot;);
            if (confirmDelete) {
                const formID = this.parentNode.id;
                const form = document.getElementById(formID);
                form.submit();
            }
            else {
                event.preventDefault();
            }
        });
    });


            &quot;))]</value>
      <webElementGuid>03844b55-e508-4f88-b8d6-7671e1d6bfe4</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
