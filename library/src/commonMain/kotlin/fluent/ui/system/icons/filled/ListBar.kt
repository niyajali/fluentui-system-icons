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

public val FluentUi.Filled.ListBar: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ListBar",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.5f, 21f)
            horizontalLineTo(19f)
            curveTo(20.105f, 21f, 21f, 20.105f, 21f, 19f)
            verticalLineTo(18f)
            curveTo(21f, 16.895f, 20.105f, 16f, 19f, 16f)
            horizontalLineTo(9.5f)
            verticalLineTo(21f)
            close()
            moveTo(9.5f, 14.5f)
            horizontalLineTo(19f)
            curveTo(20.105f, 14.5f, 21f, 13.605f, 21f, 12.5f)
            verticalLineTo(11.5f)
            curveTo(21f, 10.395f, 20.105f, 9.5f, 19f, 9.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(14.5f)
            close()
            moveTo(8f, 9.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(5f)
            curveTo(3.895f, 14.5f, 3f, 13.605f, 3f, 12.5f)
            lineTo(3f, 11.5f)
            curveTo(3f, 10.395f, 3.895f, 9.5f, 5f, 9.5f)
            horizontalLineTo(8f)
            close()
            moveTo(9.5f, 8f)
            horizontalLineTo(19f)
            curveTo(20.105f, 8f, 21f, 7.105f, 21f, 6f)
            verticalLineTo(5f)
            curveTo(21f, 3.895f, 20.105f, 3f, 19f, 3f)
            horizontalLineTo(9.5f)
            verticalLineTo(8f)
            close()
            moveTo(8f, 3f)
            verticalLineTo(8f)
            horizontalLineTo(5f)
            curveTo(3.895f, 8f, 3f, 7.105f, 3f, 6f)
            lineTo(3f, 5f)
            curveTo(3f, 3.895f, 3.895f, 3f, 5f, 3f)
            horizontalLineTo(8f)
            close()
            moveTo(8f, 16f)
            verticalLineTo(21f)
            horizontalLineTo(5f)
            curveTo(3.895f, 21f, 3f, 20.105f, 3f, 19f)
            lineTo(3f, 18f)
            curveTo(3f, 16.895f, 3.895f, 16f, 5f, 16f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ListBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ListBar, contentDescription = null)
    }
}
