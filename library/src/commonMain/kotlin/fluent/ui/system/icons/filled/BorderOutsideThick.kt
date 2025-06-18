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

public val FluentUi.Filled.BorderOutsideThick: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BorderOutsideThick",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.5f, 5.75f)
            curveTo(2.5f, 3.955f, 3.955f, 2.5f, 5.75f, 2.5f)
            horizontalLineTo(18.25f)
            curveTo(20.045f, 2.5f, 21.5f, 3.955f, 21.5f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(21.5f, 20.045f, 20.045f, 21.5f, 18.25f, 21.5f)
            horizontalLineTo(5.75f)
            curveTo(3.955f, 21.5f, 2.5f, 20.045f, 2.5f, 18.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(5.75f, 5f)
            curveTo(5.336f, 5f, 5f, 5.336f, 5f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(5f, 18.664f, 5.336f, 19f, 5.75f, 19f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 19f, 19f, 18.664f, 19f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(19f, 5.336f, 18.664f, 5f, 18.25f, 5f)
            horizontalLineTo(5.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BorderOutsideThickPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BorderOutsideThick, contentDescription = null)
    }
}
