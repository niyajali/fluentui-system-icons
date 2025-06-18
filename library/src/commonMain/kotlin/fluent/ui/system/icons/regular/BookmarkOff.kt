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

public val FluentUi.Regular.BookmarkOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookmarkOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(5.008f, 6.068f)
            curveTo(5.004f, 6.128f, 5.003f, 6.188f, 5.003f, 6.249f)
            verticalLineTo(21.245f)
            curveTo(5.003f, 21.856f, 5.694f, 22.211f, 6.191f, 21.854f)
            lineTo(12.002f, 17.673f)
            lineTo(17.813f, 21.854f)
            curveTo(18.309f, 22.211f, 19.001f, 21.856f, 19.001f, 21.245f)
            verticalLineTo(20.062f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(17.501f, 18.562f)
            verticalLineTo(19.782f)
            lineTo(12.44f, 16.14f)
            curveTo(12.178f, 15.952f, 11.825f, 15.952f, 11.564f, 16.14f)
            lineTo(6.503f, 19.782f)
            verticalLineTo(7.563f)
            lineTo(17.501f, 18.562f)
            close()
            moveTo(17.501f, 6.249f)
            verticalLineTo(14.319f)
            lineTo(19.001f, 15.819f)
            verticalLineTo(6.249f)
            curveTo(19.001f, 4.454f, 17.546f, 2.999f, 15.751f, 2.999f)
            horizontalLineTo(8.253f)
            curveTo(7.658f, 2.999f, 7.1f, 3.159f, 6.62f, 3.438f)
            lineTo(7.753f, 4.571f)
            curveTo(7.912f, 4.524f, 8.079f, 4.499f, 8.253f, 4.499f)
            horizontalLineTo(15.751f)
            curveTo(16.718f, 4.499f, 17.501f, 5.283f, 17.501f, 6.249f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookmarkOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BookmarkOff, contentDescription = null)
    }
}
