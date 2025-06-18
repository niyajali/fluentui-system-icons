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

public val FluentUi.Regular.EqualOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EqualOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(6.939f, 8f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 8f, 3f, 8.336f, 3f, 8.75f)
            curveTo(3f, 9.164f, 3.336f, 9.5f, 3.75f, 9.5f)
            horizontalLineTo(8.439f)
            lineTo(13.439f, 14.5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 14.5f, 3f, 14.836f, 3f, 15.25f)
            curveTo(3f, 15.664f, 3.336f, 16f, 3.75f, 16f)
            horizontalLineTo(14.939f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(20.25f, 14.5f)
            horizontalLineTo(17.682f)
            lineTo(19.182f, 16f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 16f, 21f, 15.664f, 21f, 15.25f)
            curveTo(21f, 14.836f, 20.664f, 14.5f, 20.25f, 14.5f)
            close()
            moveTo(11.182f, 8f)
            lineTo(12.682f, 9.5f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 9.5f, 21f, 9.164f, 21f, 8.75f)
            curveTo(21f, 8.336f, 20.664f, 8f, 20.25f, 8f)
            horizontalLineTo(11.182f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EqualOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.EqualOff, contentDescription = null)
    }
}
