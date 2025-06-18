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

public val FluentUi.Filled.TextSortDescending: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextSortDescending",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 5f)
            curveTo(3f, 3.343f, 4.343f, 2f, 6f, 2f)
            horizontalLineTo(10f)
            curveTo(10.552f, 2f, 11f, 2.448f, 11f, 3f)
            verticalLineTo(10f)
            curveTo(11f, 10.552f, 10.552f, 11f, 10f, 11f)
            curveTo(9.448f, 11f, 9f, 10.552f, 9f, 10f)
            verticalLineTo(8f)
            horizontalLineTo(6.339f)
            curveTo(6.307f, 8.007f, 6.26f, 8.018f, 6.203f, 8.036f)
            curveTo(6.067f, 8.079f, 5.888f, 8.154f, 5.712f, 8.28f)
            curveTo(5.406f, 8.501f, 5f, 8.951f, 5f, 10f)
            curveTo(5f, 10.552f, 4.552f, 11f, 4f, 11f)
            curveTo(3.448f, 11f, 3f, 10.552f, 3f, 10f)
            curveTo(3f, 8.727f, 3.405f, 7.818f, 3.953f, 7.193f)
            curveTo(3.367f, 6.646f, 3f, 5.866f, 3f, 5f)
            close()
            moveTo(6.27f, 6f)
            horizontalLineTo(9f)
            verticalLineTo(4f)
            horizontalLineTo(6f)
            curveTo(5.448f, 4f, 5f, 4.448f, 5f, 5f)
            curveTo(5f, 5.552f, 5.448f, 6f, 6f, 6f)
            horizontalLineTo(6.244f)
            curveTo(6.253f, 6f, 6.262f, 6f, 6.27f, 6f)
            close()
            moveTo(17.5f, 2f)
            curveTo(18.052f, 2f, 18.5f, 2.448f, 18.5f, 3f)
            verticalLineTo(18.586f)
            lineTo(20.293f, 16.793f)
            curveTo(20.683f, 16.402f, 21.317f, 16.402f, 21.707f, 16.793f)
            curveTo(22.098f, 17.183f, 22.098f, 17.817f, 21.707f, 18.207f)
            lineTo(18.207f, 21.707f)
            curveTo(17.817f, 22.098f, 17.183f, 22.098f, 16.793f, 21.707f)
            lineTo(13.293f, 18.207f)
            curveTo(12.902f, 17.817f, 12.902f, 17.183f, 13.293f, 16.793f)
            curveTo(13.683f, 16.402f, 14.317f, 16.402f, 14.707f, 16.793f)
            lineTo(16.5f, 18.586f)
            verticalLineTo(3f)
            curveTo(16.5f, 2.448f, 16.948f, 2f, 17.5f, 2f)
            close()
            moveTo(7.979f, 12.673f)
            curveTo(7.839f, 12.27f, 7.46f, 12f, 7.034f, 12f)
            curveTo(6.608f, 12f, 6.228f, 12.27f, 6.089f, 12.673f)
            lineTo(3.296f, 20.742f)
            curveTo(3.115f, 21.264f, 3.391f, 21.833f, 3.913f, 22.014f)
            curveTo(4.435f, 22.195f, 5.005f, 21.918f, 5.186f, 21.396f)
            lineTo(5.597f, 20.207f)
            horizontalLineTo(8.47f)
            lineTo(8.882f, 21.396f)
            curveTo(9.063f, 21.918f, 9.632f, 22.195f, 10.154f, 22.014f)
            curveTo(10.676f, 21.833f, 10.953f, 21.264f, 10.772f, 20.742f)
            lineTo(7.979f, 12.673f)
            close()
            moveTo(6.29f, 18.207f)
            lineTo(7.034f, 16.057f)
            lineTo(7.778f, 18.207f)
            horizontalLineTo(6.29f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextSortDescendingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextSortDescending, contentDescription = null)
    }
}
