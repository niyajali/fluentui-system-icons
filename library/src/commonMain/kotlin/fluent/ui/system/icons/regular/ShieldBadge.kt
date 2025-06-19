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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ShieldBadge: ImageVector
    get() {
        if (_ShieldBadge != null) {
            return _ShieldBadge!!
        }
        _ShieldBadge = ImageVector.Builder(
            name = "Regular.ShieldBadge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.75f, 5f)
                curveTo(3.231f, 5f, 2f, 6.231f, 2f, 7.75f)
                verticalLineTo(12.25f)
                curveTo(2f, 13.769f, 3.231f, 15f, 4.75f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(13.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 13.5f, 3.5f, 12.94f, 3.5f, 12.25f)
                verticalLineTo(7.75f)
                curveTo(3.5f, 7.06f, 4.06f, 6.5f, 4.75f, 6.5f)
                horizontalLineTo(17.25f)
                curveTo(17.94f, 6.5f, 18.5f, 7.06f, 18.5f, 7.75f)
                verticalLineTo(9.083f)
                curveTo(18.956f, 9.633f, 19.492f, 9.986f, 20f, 10.215f)
                verticalLineTo(7.75f)
                curveTo(20f, 6.231f, 18.769f, 5f, 17.25f, 5f)
                horizontalLineTo(4.75f)
                close()
                moveTo(17f, 9.25f)
                curveTo(16.757f, 9.25f, 16.529f, 9.368f, 16.388f, 9.566f)
                lineTo(16.38f, 9.578f)
                curveTo(16.355f, 9.611f, 16.278f, 9.711f, 16.154f, 9.849f)
                curveTo(15.987f, 10.034f, 15.739f, 10.283f, 15.417f, 10.531f)
                curveTo(14.77f, 11.03f, 13.865f, 11.5f, 12.75f, 11.5f)
                curveTo(12.336f, 11.5f, 12f, 11.836f, 12f, 12.25f)
                verticalLineTo(15f)
                curveTo(12f, 16.643f, 12.438f, 17.947f, 13.299f, 18.98f)
                curveTo(14.145f, 19.996f, 15.343f, 20.68f, 16.737f, 21.202f)
                curveTo(16.906f, 21.266f, 17.094f, 21.266f, 17.263f, 21.202f)
                curveTo(18.657f, 20.68f, 19.855f, 19.996f, 20.701f, 18.98f)
                curveTo(21.562f, 17.947f, 22f, 16.643f, 22f, 15f)
                verticalLineTo(12.25f)
                curveTo(22f, 11.836f, 21.664f, 11.5f, 21.25f, 11.5f)
                curveTo(20.135f, 11.5f, 19.23f, 11.03f, 18.583f, 10.531f)
                curveTo(18.261f, 10.283f, 18.013f, 10.034f, 17.846f, 9.849f)
                curveTo(17.722f, 9.711f, 17.645f, 9.611f, 17.62f, 9.578f)
                lineTo(17.613f, 9.568f)
                curveTo(17.472f, 9.369f, 17.244f, 9.25f, 17f, 9.25f)
                close()
                moveTo(16.333f, 11.719f)
                curveTo(16.594f, 11.517f, 16.817f, 11.316f, 17f, 11.135f)
                curveTo(17.183f, 11.316f, 17.406f, 11.517f, 17.667f, 11.719f)
                curveTo(18.343f, 12.24f, 19.302f, 12.782f, 20.5f, 12.948f)
                verticalLineTo(15f)
                curveTo(20.5f, 16.357f, 20.146f, 17.303f, 19.549f, 18.02f)
                curveTo(18.98f, 18.703f, 18.139f, 19.24f, 17f, 19.696f)
                curveTo(15.861f, 19.24f, 15.02f, 18.703f, 14.451f, 18.02f)
                curveTo(13.854f, 17.303f, 13.5f, 16.357f, 13.5f, 15f)
                verticalLineTo(12.948f)
                curveTo(14.698f, 12.782f, 15.658f, 12.24f, 16.333f, 11.719f)
                close()
                moveTo(16.388f, 9.566f)
                curveTo(16.388f, 9.567f, 16.387f, 9.567f, 16.387f, 9.568f)
                close()
            }
        }.build()

        return _ShieldBadge!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldBadge: ImageVector? = null

@Preview
@Composable
private fun ShieldBadgePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShieldBadge, contentDescription = null)
    }
}
