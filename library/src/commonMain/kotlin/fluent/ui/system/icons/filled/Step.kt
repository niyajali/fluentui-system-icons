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

public val FluentUi.Filled.Step: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Step",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.75f, 2f)
            curveTo(15.06f, 2f, 14.5f, 2.56f, 14.5f, 3.25f)
            verticalLineTo(8f)
            horizontalLineTo(9.25f)
            curveTo(8.56f, 8f, 8f, 8.56f, 8f, 9.25f)
            verticalLineTo(14.5f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 14.5f, 2f, 15.06f, 2f, 15.75f)
            verticalLineTo(20.75f)
            curveTo(2f, 21.44f, 2.56f, 22f, 3.25f, 22f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
            verticalLineTo(3.25f)
            curveTo(22f, 2.56f, 21.44f, 2f, 20.75f, 2f)
            horizontalLineTo(15.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StepPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Step, contentDescription = null)
    }
}
