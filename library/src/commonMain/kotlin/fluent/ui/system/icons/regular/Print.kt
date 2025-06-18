package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.Print: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Print",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.752f, 3f)
            curveTo(16.995f, 3f, 18.003f, 4.007f, 18.003f, 5.25f)
            lineTo(18.002f, 6.003f)
            lineTo(18.753f, 6.004f)
            curveTo(20.547f, 6.005f, 22.001f, 7.459f, 22.004f, 9.252f)
            lineTo(22.007f, 15.25f)
            curveTo(22.009f, 16.492f, 21.002f, 17.5f, 19.759f, 17.501f)
            lineTo(18f, 17.5f)
            verticalLineTo(18.75f)
            curveTo(18f, 19.993f, 16.993f, 21f, 15.75f, 21f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 21f, 6f, 19.993f, 6f, 18.75f)
            lineTo(6.001f, 17.5f)
            lineTo(4.25f, 17.5f)
            curveTo(3.007f, 17.5f, 2f, 16.493f, 2f, 15.25f)
            verticalLineTo(9.254f)
            curveTo(2f, 7.459f, 3.455f, 6.004f, 5.25f, 6.004f)
            lineTo(5.999f, 6.003f)
            lineTo(6f, 5.25f)
            curveTo(6f, 4.007f, 7.007f, 3f, 8.25f, 3f)
            horizontalLineTo(15.752f)
            close()
            moveTo(15.75f, 13.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 13.5f, 7.5f, 13.836f, 7.5f, 14.25f)
            verticalLineTo(18.75f)
            curveTo(7.5f, 19.164f, 7.836f, 19.5f, 8.25f, 19.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 19.5f, 16.5f, 19.164f, 16.5f, 18.75f)
            verticalLineTo(14.25f)
            curveTo(16.5f, 13.836f, 16.164f, 13.5f, 15.75f, 13.5f)
            close()
            moveTo(18.752f, 7.504f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 7.504f, 3.5f, 8.287f, 3.5f, 9.254f)
            verticalLineTo(15.25f)
            curveTo(3.5f, 15.664f, 3.836f, 16f, 4.25f, 16f)
            lineTo(6f, 16f)
            verticalLineTo(14.25f)
            curveTo(6f, 13.007f, 7.007f, 12f, 8.25f, 12f)
            horizontalLineTo(15.75f)
            curveTo(16.993f, 12f, 18f, 13.007f, 18f, 14.25f)
            lineTo(18.001f, 16f)
            lineTo(19.783f, 16f)
            curveTo(20.185f, 15.987f, 20.508f, 15.657f, 20.507f, 15.251f)
            lineTo(20.504f, 9.254f)
            curveTo(20.502f, 8.288f, 19.719f, 7.505f, 18.752f, 7.504f)
            close()
            moveTo(15.752f, 4.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 4.5f, 7.5f, 4.836f, 7.5f, 5.25f)
            lineTo(7.499f, 6.003f)
            horizontalLineTo(16.502f)
            lineTo(16.503f, 5.25f)
            curveTo(16.503f, 4.836f, 16.167f, 4.5f, 15.752f, 4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PrintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Print, contentDescription = null)
    }
}
