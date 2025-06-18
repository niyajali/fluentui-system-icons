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

public val FluentUi.Regular.PenProhibited: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PenProhibited",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.891f, 3.047f)
            curveTo(17.288f, 1.65f, 19.554f, 1.65f, 20.952f, 3.047f)
            curveTo(22.349f, 4.445f, 22.349f, 6.71f, 20.952f, 8.108f)
            lineTo(17.907f, 11.153f)
            curveTo(17.454f, 11.052f, 16.983f, 11f, 16.5f, 11f)
            curveTo(16.302f, 11f, 16.106f, 11.009f, 15.913f, 11.026f)
            lineTo(19.891f, 7.047f)
            curveTo(20.703f, 6.235f, 20.703f, 4.919f, 19.891f, 4.108f)
            curveTo(19.08f, 3.296f, 17.763f, 3.296f, 16.952f, 4.108f)
            lineTo(5.002f, 16.059f)
            curveTo(4.792f, 16.269f, 4.644f, 16.534f, 4.575f, 16.823f)
            lineTo(3.762f, 20.239f)
            lineTo(7.178f, 19.425f)
            curveTo(7.467f, 19.356f, 7.731f, 19.209f, 7.941f, 18.999f)
            lineTo(10.026f, 16.913f)
            curveTo(10.009f, 17.107f, 10f, 17.302f, 10f, 17.5f)
            curveTo(10f, 17.983f, 10.053f, 18.455f, 10.153f, 18.908f)
            lineTo(9.002f, 20.059f)
            curveTo(8.595f, 20.466f, 8.084f, 20.751f, 7.525f, 20.885f)
            lineTo(2.924f, 21.98f)
            curveTo(2.67f, 22.04f, 2.404f, 21.965f, 2.22f, 21.781f)
            curveTo(2.036f, 21.597f, 1.96f, 21.33f, 2.02f, 21.077f)
            lineTo(3.116f, 16.475f)
            curveTo(3.249f, 15.916f, 3.535f, 15.405f, 3.941f, 14.999f)
            lineTo(15.891f, 3.047f)
            close()
            moveTo(22f, 17.5f)
            curveTo(22f, 14.462f, 19.538f, 12f, 16.5f, 12f)
            curveTo(13.462f, 12f, 11f, 14.462f, 11f, 17.5f)
            curveTo(11f, 20.537f, 13.462f, 23f, 16.5f, 23f)
            curveTo(19.538f, 23f, 22f, 20.537f, 22f, 17.5f)
            close()
            moveTo(12.5f, 17.5f)
            curveTo(12.5f, 15.29f, 14.291f, 13.5f, 16.5f, 13.5f)
            curveTo(17.333f, 13.5f, 18.108f, 13.755f, 18.748f, 14.191f)
            lineTo(13.191f, 19.748f)
            curveTo(12.755f, 19.107f, 12.5f, 18.333f, 12.5f, 17.5f)
            close()
            moveTo(16.5f, 21.5f)
            curveTo(15.667f, 21.5f, 14.892f, 21.245f, 14.252f, 20.809f)
            lineTo(19.809f, 15.251f)
            curveTo(20.245f, 15.892f, 20.5f, 16.666f, 20.5f, 17.5f)
            curveTo(20.5f, 19.709f, 18.709f, 21.5f, 16.5f, 21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PenProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PenProhibited, contentDescription = null)
    }
}
