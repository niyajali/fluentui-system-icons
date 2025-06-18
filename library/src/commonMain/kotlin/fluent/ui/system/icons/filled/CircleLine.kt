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

public val FluentUi.Filled.CircleLine: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleLine",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.972f, 12.75f)
            horizontalLineTo(2.027f)
            curveTo(2.411f, 17.923f, 6.729f, 22f, 12f, 22f)
            curveTo(17.27f, 22f, 21.588f, 17.923f, 21.972f, 12.75f)
            close()
            moveTo(21.972f, 11.25f)
            horizontalLineTo(2.027f)
            curveTo(2.411f, 6.077f, 6.729f, 2f, 12f, 2f)
            curveTo(17.27f, 2f, 21.588f, 6.077f, 21.972f, 11.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CircleLinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CircleLine, contentDescription = null)
    }
}
