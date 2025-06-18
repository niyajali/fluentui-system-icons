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

public val FluentUi.Regular.DataTrending: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataTrending",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 3.75f)
            curveTo(4.5f, 3.336f, 4.164f, 3f, 3.75f, 3f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 21f, 21f, 20.664f, 21f, 20.25f)
            curveTo(21f, 19.836f, 20.664f, 19.5f, 20.25f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(3.75f)
            close()
            moveTo(14.75f, 6f)
            curveTo(14.336f, 6f, 14f, 6.336f, 14f, 6.75f)
            curveTo(14f, 7.164f, 14.336f, 7.5f, 14.75f, 7.5f)
            horizontalLineTo(17.939f)
            lineTo(13.25f, 12.189f)
            lineTo(11.28f, 10.22f)
            curveTo(10.987f, 9.927f, 10.513f, 9.927f, 10.22f, 10.22f)
            lineTo(6.47f, 13.97f)
            curveTo(6.177f, 14.263f, 6.177f, 14.737f, 6.47f, 15.03f)
            curveTo(6.763f, 15.323f, 7.237f, 15.323f, 7.53f, 15.03f)
            lineTo(10.75f, 11.811f)
            lineTo(12.72f, 13.78f)
            curveTo(13.013f, 14.073f, 13.487f, 14.073f, 13.78f, 13.78f)
            lineTo(19.001f, 8.559f)
            lineTo(19.001f, 11.755f)
            curveTo(19.001f, 12.169f, 19.337f, 12.505f, 19.751f, 12.505f)
            curveTo(20.166f, 12.505f, 20.501f, 12.169f, 20.501f, 11.755f)
            lineTo(20.501f, 6.75f)
            curveTo(20.501f, 6.336f, 20.166f, 6f, 19.751f, 6f)
            horizontalLineTo(14.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DataTrendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DataTrending, contentDescription = null)
    }
}
