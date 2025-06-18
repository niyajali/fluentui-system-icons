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

public val FluentUi.Regular.HeadphonesSoundWave: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HeadphonesSoundWave",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 12f)
            curveTo(3.5f, 7.306f, 7.306f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            verticalLineTo(14f)
            horizontalLineTo(18.25f)
            curveTo(17.836f, 14f, 17.5f, 14.336f, 17.5f, 14.75f)
            verticalLineTo(21.25f)
            curveTo(17.5f, 21.664f, 17.836f, 22f, 18.25f, 22f)
            horizontalLineTo(19f)
            curveTo(20.657f, 22f, 22f, 20.657f, 22f, 19f)
            verticalLineTo(12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
            verticalLineTo(19f)
            curveTo(2f, 20.657f, 3.343f, 22f, 5f, 22f)
            horizontalLineTo(5.75f)
            curveTo(6.164f, 22f, 6.5f, 21.664f, 6.5f, 21.25f)
            verticalLineTo(14.75f)
            curveTo(6.5f, 14.336f, 6.164f, 14f, 5.75f, 14f)
            horizontalLineTo(3.5f)
            verticalLineTo(12f)
            close()
            moveTo(20.5f, 15.5f)
            verticalLineTo(19f)
            curveTo(20.5f, 19.828f, 19.828f, 20.5f, 19f, 20.5f)
            verticalLineTo(15.5f)
            horizontalLineTo(20.5f)
            close()
            moveTo(3.5f, 19f)
            verticalLineTo(15.5f)
            horizontalLineTo(5f)
            verticalLineTo(20.5f)
            curveTo(4.172f, 20.5f, 3.5f, 19.828f, 3.5f, 19f)
            close()
            moveTo(12.75f, 11.75f)
            curveTo(12.75f, 11.336f, 12.414f, 11f, 12f, 11f)
            curveTo(11.586f, 11f, 11.25f, 11.336f, 11.25f, 11.75f)
            verticalLineTo(22.25f)
            curveTo(11.25f, 22.664f, 11.586f, 23f, 12f, 23f)
            curveTo(12.414f, 23f, 12.75f, 22.664f, 12.75f, 22.25f)
            verticalLineTo(11.75f)
            close()
            moveTo(8.75f, 14f)
            curveTo(9.164f, 14f, 9.5f, 14.335f, 9.5f, 14.75f)
            verticalLineTo(19.25f)
            curveTo(9.5f, 19.664f, 9.164f, 20f, 8.75f, 20f)
            curveTo(8.336f, 20f, 8f, 19.664f, 8f, 19.25f)
            verticalLineTo(14.75f)
            curveTo(8f, 14.335f, 8.336f, 14f, 8.75f, 14f)
            close()
            moveTo(16f, 14.75f)
            curveTo(16f, 14.336f, 15.664f, 14f, 15.25f, 14f)
            curveTo(14.836f, 14f, 14.5f, 14.336f, 14.5f, 14.75f)
            verticalLineTo(19.25f)
            curveTo(14.5f, 19.664f, 14.836f, 20f, 15.25f, 20f)
            curveTo(15.664f, 20f, 16f, 19.664f, 16f, 19.25f)
            verticalLineTo(14.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeadphonesSoundWavePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HeadphonesSoundWave, contentDescription = null)
    }
}
