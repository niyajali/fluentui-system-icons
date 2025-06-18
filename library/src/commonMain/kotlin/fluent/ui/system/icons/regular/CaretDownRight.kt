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

public val FluentUi.Regular.CaretDownRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CaretDownRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.5f, 7.811f)
            lineTo(7.811f, 16.5f)
            horizontalLineTo(16.25f)
            curveTo(16.389f, 16.5f, 16.5f, 16.389f, 16.5f, 16.25f)
            verticalLineTo(7.811f)
            close()
            moveTo(15.867f, 6.324f)
            curveTo(16.654f, 5.536f, 18f, 6.094f, 18f, 7.208f)
            verticalLineTo(16.25f)
            curveTo(18f, 17.217f, 17.217f, 18f, 16.25f, 18f)
            horizontalLineTo(7.208f)
            curveTo(6.094f, 18f, 5.536f, 16.654f, 6.324f, 15.867f)
            lineTo(15.867f, 6.324f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CaretDownRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CaretDownRight, contentDescription = null)
    }
}
