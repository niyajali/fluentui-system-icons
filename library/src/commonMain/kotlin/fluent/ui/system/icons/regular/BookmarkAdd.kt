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

public val FluentUi.Regular.BookmarkAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookmarkAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 6.5f)
            curveTo(23f, 3.462f, 20.537f, 1f, 17.5f, 1f)
            curveTo(14.462f, 1f, 12f, 3.462f, 12f, 6.5f)
            curveTo(12f, 9.538f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.537f, 12f, 23f, 9.538f, 23f, 6.5f)
            close()
            moveTo(18f, 7f)
            lineTo(18.001f, 9.504f)
            curveTo(18.001f, 9.78f, 17.777f, 10.003f, 17.501f, 10.003f)
            curveTo(17.225f, 10.003f, 17.001f, 9.78f, 17.001f, 9.504f)
            lineTo(17f, 7f)
            horizontalLineTo(14.495f)
            curveTo(14.219f, 7f, 13.996f, 6.776f, 13.996f, 6.5f)
            curveTo(13.996f, 6.224f, 14.219f, 6f, 14.495f, 6f)
            horizontalLineTo(17f)
            lineTo(17f, 3.499f)
            curveTo(17f, 3.223f, 17.223f, 2.999f, 17.5f, 2.999f)
            curveTo(17.776f, 2.999f, 18f, 3.223f, 18f, 3.499f)
            lineTo(18f, 6f)
            horizontalLineTo(20.496f)
            curveTo(20.772f, 6f, 20.996f, 6.224f, 20.996f, 6.5f)
            curveTo(20.996f, 6.776f, 20.772f, 7f, 20.496f, 7f)
            horizontalLineTo(18f)
            close()
            moveTo(17.5f, 19.781f)
            verticalLineTo(13f)
            curveTo(18.017f, 13f, 18.519f, 12.94f, 19f, 12.826f)
            verticalLineTo(21.245f)
            curveTo(19f, 21.856f, 18.309f, 22.211f, 17.812f, 21.854f)
            lineTo(12.001f, 17.673f)
            lineTo(6.19f, 21.854f)
            curveTo(5.694f, 22.211f, 5.002f, 21.856f, 5.002f, 21.245f)
            verticalLineTo(6.249f)
            curveTo(5.002f, 4.454f, 6.457f, 2.999f, 8.252f, 2.999f)
            horizontalLineTo(12.022f)
            curveTo(11.725f, 3.462f, 11.486f, 3.966f, 11.313f, 4.499f)
            horizontalLineTo(8.252f)
            curveTo(7.285f, 4.499f, 6.502f, 5.283f, 6.502f, 6.249f)
            verticalLineTo(19.781f)
            lineTo(11.563f, 16.14f)
            curveTo(11.825f, 15.952f, 12.177f, 15.952f, 12.439f, 16.14f)
            lineTo(17.5f, 19.781f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookmarkAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BookmarkAdd, contentDescription = null)
    }
}
