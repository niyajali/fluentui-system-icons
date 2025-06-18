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

public val FluentUi.Filled.Flag: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flag",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 3.748f)
            curveTo(3f, 3.334f, 3.336f, 2.998f, 3.75f, 2.998f)
            horizontalLineTo(20.254f)
            curveTo(20.872f, 2.998f, 21.225f, 3.704f, 20.854f, 4.198f)
            lineTo(16.69f, 9.749f)
            lineTo(20.854f, 15.3f)
            curveTo(21.225f, 15.795f, 20.872f, 16.5f, 20.254f, 16.5f)
            lineTo(4.5f, 16.5f)
            verticalLineTo(21.25f)
            curveTo(4.5f, 21.63f, 4.218f, 21.943f, 3.852f, 21.993f)
            lineTo(3.75f, 22f)
            curveTo(3.37f, 22f, 3.057f, 21.718f, 3.007f, 21.352f)
            lineTo(3f, 21.25f)
            verticalLineTo(3.748f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Flag, contentDescription = null)
    }
}
