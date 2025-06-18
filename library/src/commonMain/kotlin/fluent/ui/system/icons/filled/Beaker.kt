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

public val FluentUi.Filled.Beaker: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Beaker",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9f, 4.5f)
            verticalLineTo(10.738f)
            curveTo(9f, 11.113f, 8.906f, 11.482f, 8.727f, 11.812f)
            lineTo(7.539f, 14f)
            horizontalLineTo(16.461f)
            lineTo(15.273f, 11.812f)
            curveTo(15.094f, 11.482f, 15f, 11.113f, 15f, 10.738f)
            verticalLineTo(4.5f)
            horizontalLineTo(16f)
            curveTo(16.414f, 4.5f, 16.75f, 4.164f, 16.75f, 3.75f)
            curveTo(16.75f, 3.336f, 16.414f, 3f, 16f, 3f)
            horizontalLineTo(8f)
            curveTo(7.586f, 3f, 7.25f, 3.336f, 7.25f, 3.75f)
            curveTo(7.25f, 4.164f, 7.586f, 4.5f, 8f, 4.5f)
            horizontalLineTo(9f)
            close()
            moveTo(17.275f, 15.5f)
            horizontalLineTo(6.725f)
            lineTo(5.143f, 18.415f)
            curveTo(4.51f, 19.581f, 5.354f, 21f, 6.681f, 21f)
            horizontalLineTo(17.319f)
            curveTo(18.646f, 21f, 19.49f, 19.581f, 18.857f, 18.415f)
            lineTo(17.275f, 15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BeakerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Beaker, contentDescription = null)
    }
}
