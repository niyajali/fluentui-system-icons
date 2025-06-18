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

public val FluentUi.Regular.ArrowFitIn: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowFitIn",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.238f, 7.452f)
            curveTo(5.935f, 7.734f, 5.919f, 8.209f, 6.202f, 8.512f)
            lineTo(8.524f, 11f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 11f, 2f, 11.336f, 2f, 11.75f)
            curveTo(2f, 12.164f, 2.336f, 12.5f, 2.75f, 12.5f)
            horizontalLineTo(8.524f)
            lineTo(6.202f, 14.988f)
            curveTo(5.919f, 15.291f, 5.935f, 15.766f, 6.238f, 16.048f)
            curveTo(6.541f, 16.331f, 7.016f, 16.315f, 7.298f, 16.012f)
            lineTo(10.798f, 12.262f)
            curveTo(11.067f, 11.974f, 11.067f, 11.526f, 10.798f, 11.238f)
            lineTo(7.298f, 7.488f)
            curveTo(7.016f, 7.185f, 6.541f, 7.169f, 6.238f, 7.452f)
            close()
            moveTo(17.762f, 7.452f)
            curveTo(18.065f, 7.734f, 18.081f, 8.209f, 17.798f, 8.512f)
            lineTo(15.476f, 11f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 11f, 22f, 11.336f, 22f, 11.75f)
            curveTo(22f, 12.164f, 21.664f, 12.5f, 21.25f, 12.5f)
            horizontalLineTo(15.476f)
            lineTo(17.798f, 14.988f)
            curveTo(18.081f, 15.291f, 18.065f, 15.766f, 17.762f, 16.048f)
            curveTo(17.459f, 16.331f, 16.984f, 16.315f, 16.702f, 16.012f)
            lineTo(13.202f, 12.262f)
            curveTo(12.933f, 11.974f, 12.933f, 11.526f, 13.202f, 11.238f)
            lineTo(16.702f, 7.488f)
            curveTo(16.984f, 7.185f, 17.459f, 7.169f, 17.762f, 7.452f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowFitInPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowFitIn, contentDescription = null)
    }
}
