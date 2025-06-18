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

public val FluentUi.Regular.PhoneHeaderArrowUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhoneHeaderArrowUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.75f, 2f)
            curveTo(16.993f, 2f, 18f, 3.007f, 18f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18f, 20.993f, 16.993f, 22f, 15.75f, 22f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 22f, 6f, 20.993f, 6f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(6f, 3.007f, 7.007f, 2f, 8.25f, 2f)
            horizontalLineTo(15.75f)
            close()
            moveTo(15.75f, 3.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 3.5f, 7.5f, 3.836f, 7.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(7.5f, 20.164f, 7.836f, 20.5f, 8.25f, 20.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 20.5f, 16.5f, 20.164f, 16.5f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(16.5f, 3.836f, 16.164f, 3.5f, 15.75f, 3.5f)
            close()
            moveTo(14.75f, 5f)
            curveTo(15.164f, 5f, 15.5f, 5.336f, 15.5f, 5.75f)
            curveTo(15.5f, 6.164f, 15.164f, 6.5f, 14.75f, 6.5f)
            horizontalLineTo(9.25f)
            curveTo(8.836f, 6.5f, 8.5f, 6.164f, 8.5f, 5.75f)
            curveTo(8.5f, 5.336f, 8.836f, 5f, 9.25f, 5f)
            horizontalLineTo(14.75f)
            close()
            moveTo(12.75f, 10.535f)
            lineTo(14.025f, 11.785f)
            curveTo(14.321f, 12.075f, 14.795f, 12.071f, 15.085f, 11.775f)
            curveTo(15.375f, 11.479f, 15.371f, 11.005f, 15.075f, 10.715f)
            lineTo(12.526f, 8.215f)
            curveTo(12.384f, 8.075f, 12.192f, 7.998f, 11.993f, 8f)
            curveTo(11.794f, 8.002f, 11.604f, 8.083f, 11.465f, 8.225f)
            lineTo(9.015f, 10.725f)
            curveTo(8.725f, 11.021f, 8.73f, 11.496f, 9.026f, 11.786f)
            curveTo(9.322f, 12.076f, 9.797f, 12.071f, 10.086f, 11.775f)
            lineTo(11.25f, 10.588f)
            verticalLineTo(14.25f)
            curveTo(11.25f, 14.664f, 11.586f, 15f, 12f, 15f)
            curveTo(12.414f, 15f, 12.75f, 14.664f, 12.75f, 14.25f)
            verticalLineTo(10.535f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhoneHeaderArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PhoneHeaderArrowUp, contentDescription = null)
    }
}
