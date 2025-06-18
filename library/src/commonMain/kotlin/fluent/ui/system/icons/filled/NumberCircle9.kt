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

public val FluentUi.Filled.NumberCircle9: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle9",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
            close()
            moveTo(12f, 12.5f)
            curveTo(10.646f, 12.5f, 9.75f, 11.515f, 9.75f, 10.25f)
            curveTo(9.75f, 9.007f, 10.757f, 8f, 12f, 8f)
            curveTo(13.243f, 8f, 14.25f, 9.007f, 14.25f, 10.25f)
            curveTo(14.25f, 11.493f, 13.243f, 12.5f, 12f, 12.5f)
            close()
            moveTo(14.71f, 12.842f)
            curveTo(14.027f, 13.556f, 13.066f, 14f, 12f, 14f)
            curveTo(9.773f, 14f, 8.25f, 12.299f, 8.25f, 10.25f)
            curveTo(8.25f, 8.179f, 9.929f, 6.5f, 12f, 6.5f)
            curveTo(13.175f, 6.5f, 14.271f, 6.963f, 15.057f, 7.934f)
            curveTo(15.832f, 8.889f, 16.25f, 10.263f, 16.25f, 12f)
            curveTo(16.25f, 13.389f, 15.988f, 14.741f, 15.315f, 15.769f)
            curveTo(14.614f, 16.841f, 13.502f, 17.5f, 12f, 17.5f)
            curveTo(10.752f, 17.5f, 9.758f, 17.045f, 9.048f, 16.246f)
            curveTo(8.773f, 15.936f, 8.801f, 15.462f, 9.111f, 15.187f)
            curveTo(9.421f, 14.912f, 9.895f, 14.94f, 10.17f, 15.25f)
            curveTo(10.576f, 15.707f, 11.151f, 16f, 12f, 16f)
            curveTo(12.998f, 16f, 13.636f, 15.595f, 14.06f, 14.948f)
            curveTo(14.404f, 14.422f, 14.625f, 13.702f, 14.71f, 12.842f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NumberCircle9Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.NumberCircle9, contentDescription = null)
    }
}
