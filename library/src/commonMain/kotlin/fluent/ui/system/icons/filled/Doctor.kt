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

public val FluentUi.Filled.Doctor: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Doctor",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 3.25f)
            curveTo(9.033f, 3.25f, 8.25f, 4.034f, 8.25f, 5f)
            verticalLineTo(8.25f)
            horizontalLineTo(5f)
            curveTo(4.034f, 8.25f, 3.25f, 9.033f, 3.25f, 10f)
            verticalLineTo(14f)
            curveTo(3.25f, 14.967f, 4.034f, 15.75f, 5f, 15.75f)
            horizontalLineTo(8.25f)
            verticalLineTo(19f)
            curveTo(8.25f, 19.966f, 9.033f, 20.75f, 10f, 20.75f)
            horizontalLineTo(14f)
            curveTo(14.967f, 20.75f, 15.75f, 19.966f, 15.75f, 19f)
            verticalLineTo(15.75f)
            horizontalLineTo(19f)
            curveTo(19.966f, 15.75f, 20.75f, 14.967f, 20.75f, 14f)
            verticalLineTo(10f)
            curveTo(20.75f, 9.033f, 19.966f, 8.25f, 19f, 8.25f)
            horizontalLineTo(15.75f)
            verticalLineTo(5f)
            curveTo(15.75f, 4.034f, 14.967f, 3.25f, 14f, 3.25f)
            horizontalLineTo(10f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DoctorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Doctor, contentDescription = null)
    }
}
