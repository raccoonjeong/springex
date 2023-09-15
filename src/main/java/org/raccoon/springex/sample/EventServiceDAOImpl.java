package org.raccoon.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class EventServiceDAOImpl implements SampleDAO{
}
