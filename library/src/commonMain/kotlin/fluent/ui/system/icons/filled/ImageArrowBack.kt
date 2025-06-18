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

public val FluentUi.Filled.ImageArrowBack: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageArrowBack",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(1f, 6.5f)
            curveTo(1f, 9.538f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 9.538f, 12f, 6.5f)
            curveTo(12f, 3.462f, 9.538f, 1f, 6.5f, 1f)
            curveTo(3.462f, 1f, 1f, 3.462f, 1f, 6.5f)
            close()
            moveTo(7.646f, 4.354f)
            curveTo(7.451f, 4.158f, 7.451f, 3.842f, 7.646f, 3.646f)
            curveTo(7.842f, 3.451f, 8.158f, 3.451f, 8.354f, 3.646f)
            lineTo(9.854f, 5.146f)
            curveTo(10.049f, 5.342f, 10.049f, 5.658f, 9.854f, 5.854f)
            lineTo(8.354f, 7.354f)
            curveTo(8.158f, 7.549f, 7.842f, 7.549f, 7.646f, 7.354f)
            curveTo(7.451f, 7.158f, 7.451f, 6.842f, 7.646f, 6.646f)
            lineTo(8.293f, 6f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 6f, 4f, 7.007f, 4f, 8.25f)
            verticalLineTo(8.5f)
            curveTo(4f, 8.776f, 3.776f, 9f, 3.5f, 9f)
            curveTo(3.224f, 9f, 3f, 8.776f, 3f, 8.5f)
            verticalLineTo(8.25f)
            curveTo(3f, 6.455f, 4.455f, 5f, 6.25f, 5f)
            horizontalLineTo(8.293f)
            lineTo(7.646f, 4.354f)
            close()
            moveTo(15.752f, 7.5f)
            curveTo(16.167f, 7.5f, 16.504f, 7.837f, 16.504f, 8.252f)
            curveTo(16.504f, 8.667f, 16.167f, 9.004f, 15.752f, 9.004f)
            curveTo(15.337f, 9.004f, 15f, 8.667f, 15f, 8.252f)
            curveTo(15f, 7.837f, 15.337f, 7.5f, 15.752f, 7.5f)
            close()
            moveTo(13f, 6.5f)
            curveTo(13f, 10.09f, 10.09f, 13f, 6.5f, 13f)
            curveTo(5.211f, 13f, 4.01f, 12.625f, 3f, 11.978f)
            verticalLineTo(17.75f)
            curveTo(3f, 18.377f, 3.178f, 18.963f, 3.485f, 19.459f)
            lineTo(10.424f, 12.648f)
            lineTo(10.559f, 12.525f)
            curveTo(11.394f, 11.827f, 12.615f, 11.829f, 13.448f, 12.531f)
            lineTo(13.576f, 12.648f)
            lineTo(20.515f, 19.459f)
            curveTo(20.822f, 18.963f, 21f, 18.377f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(11.978f)
            curveTo(12.625f, 4.01f, 13f, 5.211f, 13f, 6.5f)
            close()
            moveTo(15.752f, 6f)
            curveTo(16.996f, 6f, 18.004f, 7.008f, 18.004f, 8.252f)
            curveTo(18.004f, 9.496f, 16.996f, 10.504f, 15.752f, 10.504f)
            curveTo(14.508f, 10.504f, 13.5f, 9.496f, 13.5f, 8.252f)
            curveTo(13.5f, 7.008f, 14.508f, 6f, 15.752f, 6f)
            close()
            moveTo(11.475f, 13.718f)
            lineTo(11.558f, 13.647f)
            curveTo(11.817f, 13.458f, 12.17f, 13.455f, 12.432f, 13.64f)
            lineTo(12.525f, 13.718f)
            lineTo(19.453f, 20.519f)
            curveTo(18.958f, 20.824f, 18.375f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(5.626f, 21f, 5.042f, 20.824f, 4.547f, 20.519f)
            lineTo(11.475f, 13.718f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageArrowBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ImageArrowBack, contentDescription = null)
    }
}
