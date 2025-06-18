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

public val FluentUi.Filled.TextGrammarDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextGrammarDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(15.024f, 15.024f)
            curveTo(14.828f, 15.219f, 14.828f, 15.536f, 15.024f, 15.731f)
            lineTo(16.793f, 17.501f)
            lineTo(15.026f, 19.267f)
            curveTo(14.831f, 19.463f, 14.831f, 19.779f, 15.026f, 19.975f)
            curveTo(15.222f, 20.17f, 15.538f, 20.17f, 15.733f, 19.975f)
            lineTo(17.5f, 18.208f)
            lineTo(19.269f, 19.977f)
            curveTo(19.465f, 20.172f, 19.781f, 20.172f, 19.976f, 19.977f)
            curveTo(20.172f, 19.782f, 20.172f, 19.465f, 19.976f, 19.27f)
            lineTo(18.208f, 17.501f)
            lineTo(19.979f, 15.731f)
            curveTo(20.174f, 15.536f, 20.174f, 15.219f, 19.979f, 15.024f)
            curveTo(19.784f, 14.829f, 19.467f, 14.829f, 19.272f, 15.024f)
            lineTo(17.501f, 16.794f)
            lineTo(15.731f, 15.024f)
            curveTo(15.536f, 14.829f, 15.219f, 14.829f, 15.024f, 15.024f)
            close()
            moveTo(11.019f, 17f)
            horizontalLineTo(3f)
            lineTo(2.883f, 17.007f)
            curveTo(2.386f, 17.065f, 2f, 17.487f, 2f, 18f)
            curveTo(2f, 18.552f, 2.448f, 19f, 3f, 19f)
            horizontalLineTo(11.174f)
            curveTo(11.06f, 18.518f, 11f, 18.016f, 11f, 17.5f)
            curveTo(11f, 17.332f, 11.006f, 17.165f, 11.019f, 17f)
            close()
            moveTo(11.498f, 15f)
            horizontalLineTo(3f)
            curveTo(2.448f, 15f, 2f, 14.552f, 2f, 14f)
            curveTo(2f, 13.487f, 2.386f, 13.064f, 2.883f, 13.007f)
            lineTo(3f, 13f)
            horizontalLineTo(12.81f)
            curveTo(12.257f, 13.575f, 11.81f, 14.252f, 11.498f, 15f)
            close()
            moveTo(3f, 11f)
            curveTo(2.448f, 11f, 2f, 10.552f, 2f, 10f)
            curveTo(2f, 9.487f, 2.386f, 9.064f, 2.883f, 9.007f)
            lineTo(3f, 9f)
            horizontalLineTo(21f)
            curveTo(21.552f, 9f, 22f, 9.448f, 22f, 10f)
            curveTo(22f, 10.513f, 21.614f, 10.936f, 21.117f, 10.993f)
            lineTo(21f, 11f)
            horizontalLineTo(3f)
            close()
            moveTo(21f, 5f)
            horizontalLineTo(3f)
            lineTo(2.883f, 5.007f)
            curveTo(2.386f, 5.064f, 2f, 5.487f, 2f, 6f)
            curveTo(2f, 6.552f, 2.448f, 7f, 3f, 7f)
            horizontalLineTo(21f)
            lineTo(21.117f, 6.993f)
            curveTo(21.614f, 6.936f, 22f, 6.513f, 22f, 6f)
            curveTo(22f, 5.448f, 21.552f, 5f, 21f, 5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextGrammarDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextGrammarDismiss, contentDescription = null)
    }
}
