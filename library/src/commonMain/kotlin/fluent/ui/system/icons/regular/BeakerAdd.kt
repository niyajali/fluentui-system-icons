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

public val FluentUi.Regular.BeakerAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BeakerAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 4.5f)
            horizontalLineTo(8.999f)
            verticalLineTo(10.738f)
            curveTo(8.999f, 11.113f, 8.906f, 11.482f, 8.727f, 11.812f)
            lineTo(5.142f, 18.415f)
            curveTo(4.509f, 19.581f, 5.353f, 21f, 6.68f, 21f)
            horizontalLineTo(12.021f)
            curveTo(11.725f, 20.537f, 11.485f, 20.033f, 11.313f, 19.5f)
            horizontalLineTo(6.68f)
            curveTo(6.491f, 19.5f, 6.37f, 19.297f, 6.46f, 19.131f)
            lineTo(8.431f, 15.5f)
            horizontalLineTo(11.313f)
            curveTo(11.485f, 14.967f, 11.725f, 14.463f, 12.021f, 14f)
            horizontalLineTo(9.246f)
            lineTo(10.045f, 12.527f)
            curveTo(10.343f, 11.978f, 10.5f, 11.363f, 10.5f, 10.738f)
            verticalLineTo(4.5f)
            horizontalLineTo(13.5f)
            verticalLineTo(10.738f)
            curveTo(13.5f, 11.23f, 13.596f, 11.715f, 13.782f, 12.167f)
            curveTo(14.194f, 11.879f, 14.641f, 11.638f, 15.115f, 11.451f)
            curveTo(15.039f, 11.222f, 15f, 10.981f, 15f, 10.738f)
            verticalLineTo(4.5f)
            horizontalLineTo(16f)
            curveTo(16.414f, 4.5f, 16.75f, 4.164f, 16.75f, 3.75f)
            curveTo(16.75f, 3.336f, 16.414f, 3f, 16f, 3f)
            horizontalLineTo(8f)
            curveTo(7.585f, 3f, 7.25f, 3.336f, 7.25f, 3.75f)
            curveTo(7.25f, 4.164f, 7.585f, 4.5f, 8f, 4.5f)
            close()
            moveTo(17.5f, 12f)
            curveTo(20.537f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.537f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(18.001f, 20.503f)
            lineTo(18f, 18f)
            horizontalLineTo(20.503f)
            curveTo(20.779f, 18f, 21.003f, 17.776f, 21.003f, 17.5f)
            curveTo(21.003f, 17.224f, 20.779f, 17f, 20.503f, 17f)
            horizontalLineTo(18f)
            lineTo(18f, 14.499f)
            curveTo(18f, 14.223f, 17.776f, 13.999f, 17.5f, 13.999f)
            curveTo(17.223f, 13.999f, 17f, 14.223f, 17f, 14.499f)
            lineTo(17f, 17f)
            horizontalLineTo(14.496f)
            curveTo(14.219f, 17f, 13.996f, 17.224f, 13.996f, 17.5f)
            curveTo(13.996f, 17.776f, 14.219f, 18f, 14.496f, 18f)
            horizontalLineTo(17f)
            lineTo(17.001f, 20.503f)
            curveTo(17.001f, 20.78f, 17.225f, 21.003f, 17.501f, 21.003f)
            curveTo(17.777f, 21.003f, 18.001f, 20.78f, 18.001f, 20.503f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BeakerAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BeakerAdd, contentDescription = null)
    }
}
