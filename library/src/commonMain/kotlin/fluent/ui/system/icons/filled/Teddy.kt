package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.Teddy: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Teddy",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.207f, 10.271f)
            curveTo(2.761f, 9.626f, 2.5f, 8.844f, 2.5f, 8f)
            curveTo(2.5f, 5.791f, 4.291f, 4f, 6.5f, 4f)
            curveTo(7.672f, 4f, 8.727f, 4.504f, 9.458f, 5.308f)
            curveTo(6.625f, 6.01f, 4.314f, 7.857f, 3.207f, 10.271f)
            close()
            moveTo(14.542f, 5.308f)
            curveTo(15.273f, 4.504f, 16.328f, 4f, 17.5f, 4f)
            curveTo(19.709f, 4f, 21.5f, 5.791f, 21.5f, 8f)
            curveTo(21.5f, 8.844f, 21.239f, 9.626f, 20.793f, 10.271f)
            curveTo(19.686f, 7.857f, 17.375f, 6.01f, 14.542f, 5.308f)
            close()
            moveTo(6.628f, 19.313f)
            curveTo(4.719f, 17.938f, 3.5f, 15.844f, 3.5f, 13.5f)
            curveTo(3.5f, 9.358f, 7.306f, 6f, 12f, 6f)
            curveTo(16.694f, 6f, 20.5f, 9.358f, 20.5f, 13.5f)
            curveTo(20.5f, 15.844f, 19.281f, 17.938f, 17.372f, 19.313f)
            curveTo(17.119f, 18.167f, 16.51f, 17.154f, 15.665f, 16.399f)
            curveTo(14.693f, 15.529f, 13.408f, 15f, 12f, 15f)
            curveTo(9.37f, 15f, 7.171f, 16.846f, 6.628f, 19.313f)
            close()
            moveTo(14.999f, 17.145f)
            curveTo(14.547f, 16.741f, 14.023f, 16.434f, 13.456f, 16.241f)
            curveTo(13.295f, 16.677f, 12.704f, 17f, 12f, 17f)
            curveTo(11.296f, 17f, 10.705f, 16.677f, 10.544f, 16.241f)
            curveTo(8.96f, 16.782f, 7.774f, 18.183f, 7.541f, 19.887f)
            curveTo(8.838f, 20.593f, 10.365f, 21f, 12f, 21f)
            curveTo(13.635f, 21f, 15.162f, 20.593f, 16.458f, 19.887f)
            curveTo(16.314f, 18.825f, 15.797f, 17.858f, 14.999f, 17.145f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TeddyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Teddy, contentDescription = null)
    }
}
