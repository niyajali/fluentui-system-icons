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

public val FluentUi.Filled.StarDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.788f, 3.103f)
            curveTo(11.283f, 2.1f, 12.714f, 2.1f, 13.209f, 3.103f)
            lineTo(15.567f, 7.881f)
            lineTo(20.84f, 8.647f)
            curveTo(21.947f, 8.808f, 22.389f, 10.169f, 21.588f, 10.95f)
            lineTo(20.683f, 11.832f)
            curveTo(19.742f, 11.302f, 18.656f, 11f, 17.5f, 11f)
            curveTo(13.91f, 11f, 11f, 13.911f, 11f, 17.5f)
            curveTo(11f, 18.111f, 11.084f, 18.702f, 11.241f, 19.262f)
            lineTo(7.283f, 21.343f)
            curveTo(6.292f, 21.864f, 5.135f, 21.023f, 5.324f, 19.92f)
            lineTo(6.224f, 14.669f)
            lineTo(2.409f, 10.95f)
            curveTo(1.608f, 10.169f, 2.05f, 8.808f, 3.157f, 8.647f)
            lineTo(8.43f, 7.881f)
            lineTo(10.788f, 3.103f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.463f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.463f, 23f, 17.5f)
            close()
            moveTo(15.854f, 15.147f)
            curveTo(15.658f, 14.952f, 15.342f, 14.952f, 15.146f, 15.147f)
            curveTo(14.951f, 15.342f, 14.951f, 15.659f, 15.146f, 15.854f)
            lineTo(16.793f, 17.5f)
            lineTo(15.146f, 19.147f)
            curveTo(14.951f, 19.342f, 14.951f, 19.659f, 15.146f, 19.854f)
            curveTo(15.342f, 20.049f, 15.658f, 20.049f, 15.854f, 19.854f)
            lineTo(17.5f, 18.208f)
            lineTo(19.146f, 19.854f)
            curveTo(19.342f, 20.049f, 19.658f, 20.049f, 19.854f, 19.854f)
            curveTo(20.049f, 19.659f, 20.049f, 19.342f, 19.854f, 19.147f)
            lineTo(18.207f, 17.5f)
            lineTo(19.854f, 15.854f)
            curveTo(20.049f, 15.659f, 20.049f, 15.342f, 19.854f, 15.147f)
            curveTo(19.658f, 14.952f, 19.342f, 14.952f, 19.146f, 15.147f)
            lineTo(17.5f, 16.793f)
            lineTo(15.854f, 15.147f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.StarDismiss, contentDescription = null)
    }
}
