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

public val FluentUi.Regular.Premium: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Premium",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.999f, 3f)
            curveTo(18.24f, 3f, 18.464f, 3.115f, 18.604f, 3.306f)
            lineTo(18.659f, 3.393f)
            lineTo(21.922f, 9.421f)
            lineTo(21.96f, 9.514f)
            lineTo(21.972f, 9.554f)
            lineTo(21.992f, 9.656f)
            lineTo(21.998f, 9.75f)
            curveTo(21.998f, 9.819f, 21.989f, 9.886f, 21.971f, 9.949f)
            lineTo(21.924f, 10.075f)
            lineTo(21.886f, 10.144f)
            curveTo(21.864f, 10.18f, 21.839f, 10.214f, 21.811f, 10.246f)
            lineTo(21.871f, 10.168f)
            lineTo(21.846f, 10.203f)
            lineTo(12.596f, 20.708f)
            curveTo(12.516f, 20.814f, 12.413f, 20.892f, 12.299f, 20.94f)
            lineTo(12.201f, 20.973f)
            lineTo(12.123f, 20.99f)
            lineTo(11.999f, 21f)
            lineTo(11.899f, 20.994f)
            lineTo(11.781f, 20.968f)
            curveTo(11.721f, 20.951f, 11.662f, 20.925f, 11.608f, 20.892f)
            lineTo(11.598f, 20.885f)
            curveTo(11.551f, 20.856f, 11.507f, 20.822f, 11.467f, 20.781f)
            lineTo(2.178f, 10.235f)
            lineTo(2.152f, 10.203f)
            lineTo(2.112f, 10.144f)
            curveTo(2.056f, 10.054f, 2.019f, 9.952f, 2.006f, 9.843f)
            lineTo(2f, 9.75f)
            lineTo(2.003f, 9.684f)
            lineTo(2.016f, 9.595f)
            curveTo(2.022f, 9.565f, 2.03f, 9.537f, 2.04f, 9.509f)
            lineTo(2.062f, 9.45f)
            lineTo(2.09f, 9.393f)
            lineTo(5.339f, 3.393f)
            curveTo(5.454f, 3.181f, 5.662f, 3.039f, 5.897f, 3.007f)
            lineTo(5.999f, 3f)
            horizontalLineTo(17.999f)
            close()
            moveTo(14.997f, 10.5f)
            horizontalLineTo(8.998f)
            lineTo(11.999f, 18.187f)
            lineTo(14.997f, 10.5f)
            close()
            moveTo(7.389f, 10.5f)
            horizontalLineTo(4.409f)
            lineTo(9.76f, 16.574f)
            lineTo(7.389f, 10.5f)
            close()
            moveTo(19.587f, 10.5f)
            horizontalLineTo(16.608f)
            lineTo(14.24f, 16.57f)
            lineTo(19.587f, 10.5f)
            close()
            moveTo(8.971f, 4.5f)
            horizontalLineTo(6.445f)
            lineTo(4.007f, 9f)
            horizontalLineTo(7.531f)
            lineTo(8.971f, 4.5f)
            close()
            moveTo(13.451f, 4.5f)
            horizontalLineTo(10.546f)
            lineTo(9.105f, 9f)
            horizontalLineTo(14.89f)
            lineTo(13.451f, 4.5f)
            close()
            moveTo(17.552f, 4.5f)
            horizontalLineTo(15.026f)
            lineTo(16.466f, 9f)
            horizontalLineTo(19.988f)
            lineTo(17.552f, 4.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PremiumPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Premium, contentDescription = null)
    }
}
