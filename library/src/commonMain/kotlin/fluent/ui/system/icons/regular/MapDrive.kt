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

public val FluentUi.Regular.MapDrive: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MapDrive",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.998f, 8.002f)
            curveTo(18.551f, 8.002f, 19f, 7.554f, 19f, 7f)
            curveTo(19f, 6.446f, 18.551f, 5.998f, 17.998f, 5.998f)
            curveTo(17.444f, 5.998f, 16.995f, 6.446f, 16.995f, 7f)
            curveTo(16.995f, 7.554f, 17.444f, 8.002f, 17.998f, 8.002f)
            close()
            moveTo(4.25f, 3f)
            curveTo(3.007f, 3f, 2f, 4.007f, 2f, 5.25f)
            verticalLineTo(10.25f)
            curveTo(2f, 10.664f, 2.336f, 11f, 2.75f, 11f)
            horizontalLineTo(11.25f)
            verticalLineTo(13.001f)
            horizontalLineTo(10.251f)
            curveTo(9.836f, 13.001f, 9.501f, 13.337f, 9.501f, 13.751f)
            verticalLineTo(16.004f)
            horizontalLineTo(7.751f)
            curveTo(7.337f, 16.004f, 7.001f, 16.34f, 7.001f, 16.754f)
            verticalLineTo(17.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 17.5f, 2f, 17.836f, 2f, 18.25f)
            curveTo(2f, 18.664f, 2.336f, 19f, 2.75f, 19f)
            horizontalLineTo(7.001f)
            verticalLineTo(20.253f)
            curveTo(7.001f, 20.668f, 7.337f, 21.003f, 7.751f, 21.003f)
            horizontalLineTo(16.249f)
            curveTo(16.663f, 21.003f, 16.999f, 20.668f, 16.999f, 20.253f)
            verticalLineTo(19f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 19f, 22f, 18.664f, 22f, 18.25f)
            curveTo(22f, 17.836f, 21.664f, 17.5f, 21.25f, 17.5f)
            horizontalLineTo(16.999f)
            verticalLineTo(16.754f)
            curveTo(16.999f, 16.34f, 16.663f, 16.004f, 16.249f, 16.004f)
            horizontalLineTo(14.499f)
            verticalLineTo(13.751f)
            curveTo(14.499f, 13.337f, 14.164f, 13.001f, 13.749f, 13.001f)
            horizontalLineTo(12.75f)
            verticalLineTo(11f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 11f, 22f, 10.664f, 22f, 10.25f)
            verticalLineTo(5.25f)
            curveTo(22f, 4.007f, 20.993f, 3f, 19.75f, 3f)
            horizontalLineTo(4.25f)
            close()
            moveTo(3.5f, 5.25f)
            curveTo(3.5f, 4.836f, 3.836f, 4.5f, 4.25f, 4.5f)
            horizontalLineTo(19.75f)
            curveTo(20.164f, 4.5f, 20.5f, 4.836f, 20.5f, 5.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(3.5f)
            verticalLineTo(5.25f)
            close()
            moveTo(11.001f, 14.501f)
            horizontalLineTo(12.999f)
            verticalLineTo(16.754f)
            curveTo(12.999f, 17.169f, 13.335f, 17.504f, 13.749f, 17.504f)
            horizontalLineTo(15.499f)
            verticalLineTo(19.503f)
            horizontalLineTo(8.501f)
            verticalLineTo(17.504f)
            horizontalLineTo(10.251f)
            curveTo(10.665f, 17.504f, 11.001f, 17.169f, 11.001f, 16.754f)
            verticalLineTo(14.501f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MapDrivePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MapDrive, contentDescription = null)
    }
}
