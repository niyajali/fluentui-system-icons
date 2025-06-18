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

public val FluentUi.Filled.XboxConsole: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.XboxConsole",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.75f, 2f)
            curveTo(5.336f, 2f, 5f, 2.336f, 5f, 2.75f)
            verticalLineTo(21.25f)
            curveTo(5f, 21.664f, 5.336f, 22f, 5.75f, 22f)
            horizontalLineTo(8f)
            verticalLineTo(11.75f)
            curveTo(8f, 11.336f, 8.336f, 11f, 8.75f, 11f)
            curveTo(9.164f, 11f, 9.5f, 11.336f, 9.5f, 11.75f)
            verticalLineTo(22f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 22f, 19f, 21.664f, 19f, 21.25f)
            verticalLineTo(2.75f)
            curveTo(19f, 2.336f, 18.664f, 2f, 18.25f, 2f)
            horizontalLineTo(5.75f)
            close()
            moveTo(9.5f, 5.75f)
            curveTo(9.5f, 6.164f, 9.164f, 6.5f, 8.75f, 6.5f)
            curveTo(8.336f, 6.5f, 8f, 6.164f, 8f, 5.75f)
            curveTo(8f, 5.336f, 8.336f, 5f, 8.75f, 5f)
            curveTo(9.164f, 5f, 9.5f, 5.336f, 9.5f, 5.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun XboxConsolePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.XboxConsole, contentDescription = null)
    }
}
