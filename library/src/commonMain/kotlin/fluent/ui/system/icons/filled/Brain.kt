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

public val FluentUi.Filled.Brain: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Brain",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.5f, 2f)
            curveTo(10.144f, 2f, 10.745f, 2.188f, 11.25f, 2.512f)
            verticalLineTo(21.245f)
            curveTo(10.621f, 21.718f, 9.84f, 22f, 8.994f, 22f)
            curveTo(7.268f, 22f, 5.799f, 20.813f, 5.367f, 19.199f)
            curveTo(3.459f, 18.896f, 2f, 17.244f, 2f, 15.25f)
            verticalLineTo(15f)
            curveTo(2f, 13.438f, 2.896f, 12.086f, 4.201f, 11.428f)
            curveTo(3.462f, 10.722f, 3f, 9.728f, 3f, 8.625f)
            curveTo(3f, 6.686f, 4.423f, 5.08f, 6.282f, 4.795f)
            curveTo(6.504f, 3.215f, 7.86f, 2f, 9.5f, 2f)
            close()
            moveTo(14.5f, 2f)
            curveTo(16.14f, 2f, 17.496f, 3.215f, 17.718f, 4.795f)
            curveTo(19.576f, 5.08f, 21f, 6.686f, 21f, 8.625f)
            curveTo(21f, 9.728f, 20.538f, 10.722f, 19.799f, 11.428f)
            curveTo(21.104f, 12.086f, 22f, 13.438f, 22f, 15f)
            verticalLineTo(15.25f)
            curveTo(22f, 17.244f, 20.541f, 18.896f, 18.633f, 19.199f)
            curveTo(18.201f, 20.813f, 16.732f, 22f, 15.006f, 22f)
            curveTo(14.16f, 22f, 13.379f, 21.718f, 12.75f, 21.245f)
            verticalLineTo(2.512f)
            curveTo(13.255f, 2.188f, 13.856f, 2f, 14.5f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BrainPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Brain, contentDescription = null)
    }
}
