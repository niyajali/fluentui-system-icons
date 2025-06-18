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

public val FluentUi.Regular.PenDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PenDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.952f, 3.047f)
            curveTo(19.554f, 1.65f, 17.288f, 1.65f, 15.891f, 3.048f)
            lineTo(3.941f, 14.999f)
            curveTo(3.535f, 15.405f, 3.249f, 15.917f, 3.116f, 16.476f)
            lineTo(2.02f, 21.077f)
            curveTo(1.96f, 21.33f, 2.036f, 21.597f, 2.22f, 21.781f)
            curveTo(2.404f, 21.965f, 2.67f, 22.041f, 2.924f, 21.98f)
            lineTo(7.525f, 20.885f)
            curveTo(8.084f, 20.752f, 8.595f, 20.466f, 9.002f, 20.059f)
            lineTo(10.153f, 18.908f)
            curveTo(10.053f, 18.455f, 10f, 17.984f, 10f, 17.5f)
            curveTo(10f, 17.302f, 10.009f, 17.107f, 10.026f, 16.914f)
            lineTo(7.941f, 18.999f)
            curveTo(7.731f, 19.209f, 7.467f, 19.357f, 7.178f, 19.426f)
            lineTo(3.762f, 20.239f)
            lineTo(4.575f, 16.823f)
            curveTo(4.644f, 16.534f, 4.792f, 16.27f, 5.002f, 16.06f)
            lineTo(16.952f, 4.108f)
            curveTo(17.763f, 3.296f, 19.08f, 3.296f, 19.891f, 4.108f)
            curveTo(20.703f, 4.92f, 20.703f, 6.236f, 19.891f, 7.047f)
            lineTo(15.913f, 11.026f)
            curveTo(16.106f, 11.009f, 16.302f, 11f, 16.5f, 11f)
            curveTo(16.983f, 11f, 17.454f, 11.053f, 17.907f, 11.153f)
            lineTo(20.952f, 8.108f)
            curveTo(22.349f, 6.71f, 22.349f, 4.445f, 20.952f, 3.047f)
            close()
            moveTo(22f, 17.5f)
            curveTo(22f, 20.538f, 19.538f, 23f, 16.5f, 23f)
            curveTo(13.462f, 23f, 11f, 20.538f, 11f, 17.5f)
            curveTo(11f, 14.462f, 13.462f, 12f, 16.5f, 12f)
            curveTo(19.538f, 12f, 22f, 14.462f, 22f, 17.5f)
            close()
            moveTo(14.854f, 15.146f)
            curveTo(14.658f, 14.951f, 14.342f, 14.951f, 14.146f, 15.146f)
            curveTo(13.951f, 15.342f, 13.951f, 15.658f, 14.146f, 15.854f)
            lineTo(15.793f, 17.5f)
            lineTo(14.146f, 19.146f)
            curveTo(13.951f, 19.342f, 13.951f, 19.658f, 14.146f, 19.854f)
            curveTo(14.342f, 20.049f, 14.658f, 20.049f, 14.854f, 19.854f)
            lineTo(16.5f, 18.207f)
            lineTo(18.146f, 19.854f)
            curveTo(18.342f, 20.049f, 18.658f, 20.049f, 18.854f, 19.854f)
            curveTo(19.049f, 19.658f, 19.049f, 19.342f, 18.854f, 19.146f)
            lineTo(17.207f, 17.5f)
            lineTo(18.854f, 15.854f)
            curveTo(19.049f, 15.658f, 19.049f, 15.342f, 18.854f, 15.146f)
            curveTo(18.658f, 14.951f, 18.342f, 14.951f, 18.146f, 15.146f)
            lineTo(16.5f, 16.793f)
            lineTo(14.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PenDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PenDismiss, contentDescription = null)
    }
}
