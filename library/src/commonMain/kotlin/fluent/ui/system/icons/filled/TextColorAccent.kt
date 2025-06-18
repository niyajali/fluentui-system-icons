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

public val FluentUi.Filled.TextColorAccent: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColorAccent",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 17f)
            curveTo(3.5f, 15.895f, 4.395f, 15f, 5.5f, 15f)
            lineTo(17.499f, 15f)
            curveTo(18.604f, 15f, 19.499f, 15.895f, 19.499f, 17f)
            verticalLineTo(19.5f)
            curveTo(19.499f, 20.605f, 18.604f, 21.5f, 17.499f, 21.5f)
            horizontalLineTo(5.5f)
            curveTo(4.395f, 21.5f, 3.5f, 20.605f, 3.5f, 19.5f)
            verticalLineTo(17f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextColorAccentPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextColorAccent, contentDescription = null)
    }
}
