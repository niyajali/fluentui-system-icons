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

public val FluentUi.Filled.Heart: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Heart",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.82f, 5.579f)
            lineTo(11.999f, 6.402f)
            lineTo(11.176f, 5.578f)
            curveTo(9.077f, 3.479f, 5.674f, 3.479f, 3.575f, 5.578f)
            curveTo(1.475f, 7.677f, 1.475f, 11.081f, 3.575f, 13.18f)
            lineTo(11.47f, 21.075f)
            curveTo(11.763f, 21.368f, 12.238f, 21.368f, 12.531f, 21.075f)
            lineTo(20.432f, 13.178f)
            curveTo(22.526f, 11.072f, 22.53f, 7.679f, 20.431f, 5.579f)
            curveTo(18.328f, 3.476f, 14.923f, 3.476f, 12.82f, 5.579f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Heart, contentDescription = null)
    }
}
