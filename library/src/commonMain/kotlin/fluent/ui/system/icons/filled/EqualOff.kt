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

public val FluentUi.Filled.EqualOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EqualOff",
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
            horizontalLineTo(4f)
            curveTo(3.448f, 8f, 3f, 8.448f, 3f, 9f)
            curveTo(3f, 9.552f, 3.448f, 10f, 4f, 10f)
            horizontalLineTo(8.939f)
            lineTo(12.939f, 14f)
            horizontalLineTo(4f)
            curveTo(3.448f, 14f, 3f, 14.448f, 3f, 15f)
            curveTo(3f, 15.552f, 3.448f, 16f, 4f, 16f)
            horizontalLineTo(14.939f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(20f, 14f)
            horizontalLineTo(17.182f)
            lineTo(19.182f, 16f)
            horizontalLineTo(20f)
            curveTo(20.552f, 16f, 21f, 15.552f, 21f, 15f)
            curveTo(21f, 14.448f, 20.552f, 14f, 20f, 14f)
            close()
            moveTo(11.182f, 8f)
            lineTo(13.182f, 10f)
            horizontalLineTo(20f)
            curveTo(20.552f, 10f, 21f, 9.552f, 21f, 9f)
            curveTo(21f, 8.448f, 20.552f, 8f, 20f, 8f)
            horizontalLineTo(11.182f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EqualOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.EqualOff, contentDescription = null)
    }
}
