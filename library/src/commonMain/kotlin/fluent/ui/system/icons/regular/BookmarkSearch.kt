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

public val FluentUi.Regular.BookmarkSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookmarkSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19.107f, 9.168f)
            curveTo(18.371f, 9.692f, 17.471f, 10f, 16.5f, 10f)
            curveTo(14.014f, 10f, 12f, 7.985f, 12f, 5.5f)
            curveTo(12f, 3.015f, 14.014f, 1f, 16.5f, 1f)
            curveTo(18.985f, 1f, 21f, 3.015f, 21f, 5.5f)
            curveTo(21f, 6.472f, 20.691f, 7.372f, 20.168f, 8.107f)
            lineTo(22.78f, 10.72f)
            curveTo(23.073f, 11.013f, 23.073f, 11.487f, 22.78f, 11.78f)
            curveTo(22.487f, 12.073f, 22.012f, 12.073f, 21.719f, 11.78f)
            lineTo(19.107f, 9.168f)
            close()
            moveTo(19.5f, 5.5f)
            curveTo(19.5f, 3.843f, 18.156f, 2.5f, 16.5f, 2.5f)
            curveTo(14.843f, 2.5f, 13.5f, 3.843f, 13.5f, 5.5f)
            curveTo(13.5f, 7.157f, 14.843f, 8.5f, 16.5f, 8.5f)
            curveTo(18.156f, 8.5f, 19.5f, 7.157f, 19.5f, 5.5f)
            close()
            moveTo(19f, 10.476f)
            verticalLineTo(21.245f)
            curveTo(19f, 21.856f, 18.309f, 22.211f, 17.812f, 21.854f)
            lineTo(12.001f, 17.673f)
            lineTo(6.19f, 21.854f)
            curveTo(5.694f, 22.211f, 5.002f, 21.856f, 5.002f, 21.245f)
            verticalLineTo(6.249f)
            curveTo(5.002f, 4.454f, 6.457f, 2.999f, 8.252f, 2.999f)
            horizontalLineTo(11.6f)
            curveTo(11.362f, 3.465f, 11.188f, 3.968f, 11.09f, 4.499f)
            horizontalLineTo(8.252f)
            curveTo(7.285f, 4.499f, 6.502f, 5.283f, 6.502f, 6.249f)
            verticalLineTo(19.781f)
            lineTo(11.563f, 16.14f)
            curveTo(11.825f, 15.952f, 12.177f, 15.952f, 12.439f, 16.14f)
            lineTo(17.5f, 19.781f)
            verticalLineTo(10.909f)
            curveTo(18.012f, 10.815f, 18.499f, 10.65f, 18.95f, 10.425f)
            lineTo(19f, 10.476f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BookmarkSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BookmarkSearch, contentDescription = null)
    }
}
