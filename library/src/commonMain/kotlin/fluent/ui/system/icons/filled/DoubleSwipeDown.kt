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

public val FluentUi.Filled.DoubleSwipeDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DoubleSwipeDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.207f, 21.707f)
            curveTo(17.817f, 22.098f, 17.183f, 22.098f, 16.793f, 21.707f)
            lineTo(13.793f, 18.707f)
            curveTo(13.402f, 18.317f, 13.402f, 17.683f, 13.793f, 17.293f)
            curveTo(14.183f, 16.902f, 14.817f, 16.902f, 15.207f, 17.293f)
            lineTo(16.5f, 18.586f)
            verticalLineTo(7f)
            curveTo(16.5f, 6.448f, 16.948f, 6f, 17.5f, 6f)
            curveTo(18.052f, 6f, 18.5f, 6.448f, 18.5f, 7f)
            verticalLineTo(18.586f)
            lineTo(19.793f, 17.293f)
            curveTo(20.183f, 16.902f, 20.817f, 16.902f, 21.207f, 17.293f)
            curveTo(21.598f, 17.683f, 21.598f, 18.317f, 21.207f, 18.707f)
            lineTo(18.207f, 21.707f)
            close()
            moveTo(12.5f, 7f)
            curveTo(12.5f, 9.05f, 13.734f, 10.812f, 15.5f, 11.584f)
            verticalLineTo(9.236f)
            curveTo(14.886f, 8.687f, 14.5f, 7.889f, 14.5f, 7f)
            curveTo(14.5f, 5.343f, 15.843f, 4f, 17.5f, 4f)
            curveTo(19.157f, 4f, 20.5f, 5.343f, 20.5f, 7f)
            curveTo(20.5f, 7.889f, 20.114f, 8.687f, 19.5f, 9.236f)
            verticalLineTo(11.584f)
            curveTo(21.266f, 10.812f, 22.5f, 9.05f, 22.5f, 7f)
            curveTo(22.5f, 4.239f, 20.261f, 2f, 17.5f, 2f)
            curveTo(14.739f, 2f, 12.5f, 4.239f, 12.5f, 7f)
            close()
            moveTo(4.5f, 11.584f)
            curveTo(2.734f, 10.812f, 1.5f, 9.05f, 1.5f, 7f)
            curveTo(1.5f, 4.239f, 3.739f, 2f, 6.5f, 2f)
            curveTo(9.261f, 2f, 11.5f, 4.239f, 11.5f, 7f)
            curveTo(11.5f, 9.05f, 10.266f, 10.812f, 8.5f, 11.584f)
            verticalLineTo(9.236f)
            curveTo(9.114f, 8.687f, 9.5f, 7.889f, 9.5f, 7f)
            curveTo(9.5f, 5.343f, 8.157f, 4f, 6.5f, 4f)
            curveTo(4.843f, 4f, 3.5f, 5.343f, 3.5f, 7f)
            curveTo(3.5f, 7.889f, 3.886f, 8.687f, 4.5f, 9.236f)
            verticalLineTo(11.584f)
            close()
            moveTo(7.207f, 21.707f)
            curveTo(6.817f, 22.098f, 6.183f, 22.098f, 5.793f, 21.707f)
            lineTo(2.793f, 18.707f)
            curveTo(2.402f, 18.317f, 2.402f, 17.683f, 2.793f, 17.293f)
            curveTo(3.183f, 16.902f, 3.817f, 16.902f, 4.207f, 17.293f)
            lineTo(5.5f, 18.586f)
            verticalLineTo(7f)
            curveTo(5.5f, 6.448f, 5.948f, 6f, 6.5f, 6f)
            curveTo(7.052f, 6f, 7.5f, 6.448f, 7.5f, 7f)
            verticalLineTo(18.586f)
            lineTo(8.793f, 17.293f)
            curveTo(9.183f, 16.902f, 9.817f, 16.902f, 10.207f, 17.293f)
            curveTo(10.598f, 17.683f, 10.598f, 18.317f, 10.207f, 18.707f)
            lineTo(7.207f, 21.707f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DoubleSwipeDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DoubleSwipeDown, contentDescription = null)
    }
}
