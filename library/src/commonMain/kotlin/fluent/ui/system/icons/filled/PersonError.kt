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

public val FluentUi.Filled.PersonError: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonError",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(12.023f, 14f)
            curveTo(11.376f, 15.01f, 11f, 16.211f, 11f, 17.5f)
            curveTo(11f, 19.144f, 11.611f, 20.646f, 12.617f, 21.791f)
            curveTo(11.815f, 21.932f, 10.942f, 22.001f, 10f, 22.001f)
            curveTo(7.111f, 22.001f, 4.872f, 21.344f, 3.31f, 20.001f)
            curveTo(2.481f, 19.289f, 2.004f, 18.25f, 2.004f, 17.157f)
            verticalLineTo(16.25f)
            curveTo(2.004f, 15.007f, 3.011f, 14f, 4.254f, 14f)
            horizontalLineTo(12.023f)
            close()
            moveTo(17.5f, 19.875f)
            curveTo(17.155f, 19.875f, 16.875f, 20.155f, 16.875f, 20.5f)
            curveTo(16.875f, 20.845f, 17.155f, 21.125f, 17.5f, 21.125f)
            curveTo(17.845f, 21.125f, 18.125f, 20.845f, 18.125f, 20.5f)
            curveTo(18.125f, 20.155f, 17.845f, 19.875f, 17.5f, 19.875f)
            close()
            moveTo(17.5f, 14f)
            curveTo(17.224f, 14f, 17f, 14.224f, 17f, 14.5f)
            verticalLineTo(18.5f)
            curveTo(17f, 18.776f, 17.224f, 19f, 17.5f, 19f)
            curveTo(17.776f, 19f, 18f, 18.776f, 18f, 18.5f)
            verticalLineTo(14.5f)
            curveTo(18f, 14.224f, 17.776f, 14f, 17.5f, 14f)
            close()
            moveTo(10f, 2.005f)
            curveTo(12.761f, 2.005f, 15f, 4.243f, 15f, 7.005f)
            curveTo(15f, 9.766f, 12.761f, 12.005f, 10f, 12.005f)
            curveTo(7.239f, 12.005f, 5f, 9.766f, 5f, 7.005f)
            curveTo(5f, 4.244f, 7.239f, 2.005f, 10f, 2.005f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonError, contentDescription = null)
    }
}
