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

public val FluentUi.Regular.ArrowFit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowFit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.762f, 7.452f)
            curveTo(7.065f, 7.734f, 7.081f, 8.209f, 6.798f, 8.512f)
            lineTo(4.476f, 11f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 11f, 11f, 11.336f, 11f, 11.75f)
            curveTo(11f, 12.164f, 10.664f, 12.5f, 10.25f, 12.5f)
            horizontalLineTo(4.476f)
            lineTo(6.798f, 14.988f)
            curveTo(7.081f, 15.291f, 7.065f, 15.766f, 6.762f, 16.048f)
            curveTo(6.459f, 16.331f, 5.984f, 16.315f, 5.702f, 16.012f)
            lineTo(2.202f, 12.262f)
            curveTo(1.933f, 11.974f, 1.933f, 11.526f, 2.202f, 11.238f)
            lineTo(5.702f, 7.488f)
            curveTo(5.984f, 7.185f, 6.459f, 7.169f, 6.762f, 7.452f)
            close()
            moveTo(17.238f, 7.452f)
            curveTo(16.935f, 7.734f, 16.919f, 8.209f, 17.202f, 8.512f)
            lineTo(19.524f, 11f)
            horizontalLineTo(13.75f)
            curveTo(13.336f, 11f, 13f, 11.336f, 13f, 11.75f)
            curveTo(13f, 12.164f, 13.336f, 12.5f, 13.75f, 12.5f)
            horizontalLineTo(19.524f)
            lineTo(17.202f, 14.988f)
            curveTo(16.919f, 15.291f, 16.935f, 15.766f, 17.238f, 16.048f)
            curveTo(17.541f, 16.331f, 18.016f, 16.315f, 18.298f, 16.012f)
            lineTo(21.798f, 12.262f)
            curveTo(22.067f, 11.974f, 22.067f, 11.526f, 21.798f, 11.238f)
            lineTo(18.298f, 7.488f)
            curveTo(18.016f, 7.185f, 17.541f, 7.169f, 17.238f, 7.452f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowFitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowFit, contentDescription = null)
    }
}
