package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.FoodToast: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FoodToast",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.25f, 9f)
            curveTo(7.836f, 9f, 7.5f, 9.336f, 7.5f, 9.75f)
            verticalLineTo(14.25f)
            curveTo(7.5f, 14.664f, 7.836f, 15f, 8.25f, 15f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 15f, 13.5f, 14.664f, 13.5f, 14.25f)
            verticalLineTo(9.75f)
            curveTo(13.5f, 9.336f, 13.164f, 9f, 12.75f, 9f)
            horizontalLineTo(8.25f)
            close()
            moveTo(9f, 13.5f)
            verticalLineTo(10.5f)
            horizontalLineTo(12f)
            verticalLineTo(13.5f)
            horizontalLineTo(9f)
            close()
            moveTo(2f, 7.75f)
            curveTo(2f, 5.127f, 4.127f, 3f, 6.75f, 3f)
            horizontalLineTo(17.25f)
            curveTo(19.873f, 3f, 22f, 5.127f, 22f, 7.75f)
            curveTo(22f, 8.988f, 21.526f, 10.116f, 20.75f, 10.961f)
            verticalLineTo(18.75f)
            curveTo(20.75f, 19.993f, 19.743f, 21f, 18.5f, 21f)
            horizontalLineTo(5.5f)
            curveTo(4.257f, 21f, 3.25f, 19.993f, 3.25f, 18.75f)
            verticalLineTo(10.961f)
            curveTo(2.475f, 10.116f, 2f, 8.988f, 2f, 7.75f)
            close()
            moveTo(6.75f, 4.5f)
            curveTo(4.955f, 4.5f, 3.5f, 5.955f, 3.5f, 7.75f)
            curveTo(3.5f, 8.68f, 3.889f, 9.517f, 4.516f, 10.11f)
            curveTo(4.665f, 10.252f, 4.75f, 10.449f, 4.75f, 10.655f)
            verticalLineTo(18.75f)
            curveTo(4.75f, 19.164f, 5.086f, 19.5f, 5.5f, 19.5f)
            horizontalLineTo(15.5f)
            curveTo(15.914f, 19.5f, 16.25f, 19.164f, 16.25f, 18.75f)
            verticalLineTo(11.058f)
            curveTo(16.25f, 10.81f, 16.373f, 10.578f, 16.578f, 10.438f)
            curveTo(17.438f, 9.852f, 18f, 8.866f, 18f, 7.75f)
            curveTo(18f, 5.955f, 16.545f, 4.5f, 14.75f, 4.5f)
            horizontalLineTo(6.75f)
            close()
            moveTo(19.5f, 7.75f)
            curveTo(19.5f, 9.236f, 18.817f, 10.563f, 17.75f, 11.433f)
            verticalLineTo(18.75f)
            curveTo(17.75f, 19.013f, 17.705f, 19.265f, 17.622f, 19.5f)
            horizontalLineTo(18.5f)
            curveTo(18.914f, 19.5f, 19.25f, 19.164f, 19.25f, 18.75f)
            verticalLineTo(10.655f)
            curveTo(19.25f, 10.449f, 19.335f, 10.252f, 19.484f, 10.11f)
            curveTo(20.111f, 9.517f, 20.5f, 8.68f, 20.5f, 7.75f)
            curveTo(20.5f, 6.36f, 19.627f, 5.173f, 18.399f, 4.709f)
            curveTo(19.086f, 5.533f, 19.5f, 6.593f, 19.5f, 7.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FoodToastPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FoodToast, contentDescription = null)
    }
}
