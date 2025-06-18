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

public val FluentUi.Filled.SaveMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SaveMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.75f, 3f)
            horizontalLineTo(7f)
            verticalLineTo(6.25f)
            curveTo(7f, 7.493f, 8.007f, 8.5f, 9.25f, 8.5f)
            horizontalLineTo(11.75f)
            curveTo(12.993f, 8.5f, 14f, 7.493f, 14f, 6.25f)
            verticalLineTo(3.265f)
            curveTo(14.374f, 3.426f, 14.719f, 3.658f, 15.013f, 3.952f)
            lineTo(17.048f, 5.987f)
            curveTo(17.658f, 6.597f, 18f, 7.424f, 18f, 8.286f)
            verticalLineTo(15.25f)
            curveTo(18f, 16.769f, 16.769f, 18f, 15.25f, 18f)
            horizontalLineTo(15f)
            verticalLineTo(13.25f)
            curveTo(15f, 12.007f, 13.993f, 11f, 12.75f, 11f)
            horizontalLineTo(8.25f)
            curveTo(7.007f, 11f, 6f, 12.007f, 6f, 13.25f)
            verticalLineTo(18f)
            horizontalLineTo(5.75f)
            curveTo(4.231f, 18f, 3f, 16.769f, 3f, 15.25f)
            verticalLineTo(5.75f)
            curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
            close()
            moveTo(7.5f, 18f)
            horizontalLineTo(13.5f)
            verticalLineTo(13.25f)
            curveTo(13.5f, 12.836f, 13.164f, 12.5f, 12.75f, 12.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 12.5f, 7.5f, 12.836f, 7.5f, 13.25f)
            verticalLineTo(18f)
            close()
            moveTo(8.5f, 3f)
            horizontalLineTo(12.5f)
            verticalLineTo(6.25f)
            curveTo(12.5f, 6.664f, 12.164f, 7f, 11.75f, 7f)
            horizontalLineTo(9.25f)
            curveTo(8.836f, 7f, 8.5f, 6.664f, 8.5f, 6.25f)
            verticalLineTo(3f)
            close()
            moveTo(10.75f, 21f)
            curveTo(9.384f, 21f, 8.152f, 20.423f, 7.286f, 19.5f)
            horizontalLineTo(16.25f)
            curveTo(18.045f, 19.5f, 19.5f, 18.045f, 19.5f, 16.25f)
            verticalLineTo(8.439f)
            lineTo(20.048f, 8.988f)
            curveTo(20.657f, 9.597f, 21f, 10.424f, 21f, 11.286f)
            verticalLineTo(16.25f)
            curveTo(21f, 18.874f, 18.873f, 21f, 16.25f, 21f)
            horizontalLineTo(10.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SaveMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SaveMultiple, contentDescription = null)
    }
}
