/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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

public val FluentIcons.Regular.BinRecycleFull: ImageVector
    get() {
        if (_BinRecycleFull != null) {
            return _BinRecycleFull!!
        }
        _BinRecycleFull = ImageVector.Builder(
            name = "Regular.BinRecycleFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.49f, 1f)
                curveTo(7.889f, 1f, 8.27f, 1.159f, 8.55f, 1.443f)
                lineTo(11f, 3.92f)
                verticalLineTo(2.75f)
                curveTo(11f, 1.783f, 11.783f, 1f, 12.75f, 1f)
                horizontalLineTo(16.25f)
                curveTo(17.216f, 1f, 18f, 1.783f, 18f, 2.75f)
                verticalLineTo(5.5f)
                horizontalLineTo(19.372f)
                curveTo(19.585f, 5.5f, 19.788f, 5.591f, 19.931f, 5.749f)
                curveTo(20.073f, 5.907f, 20.141f, 6.119f, 20.118f, 6.331f)
                lineTo(18.641f, 19.992f)
                curveTo(18.517f, 21.134f, 17.553f, 22f, 16.404f, 22f)
                horizontalLineTo(7.596f)
                curveTo(6.448f, 22f, 5.483f, 21.135f, 5.36f, 19.993f)
                lineTo(3.878f, 6.331f)
                curveTo(3.855f, 6.119f, 3.924f, 5.908f, 4.066f, 5.749f)
                curveTo(4.208f, 5.591f, 4.411f, 5.5f, 4.624f, 5.5f)
                horizontalLineTo(6f)
                verticalLineTo(2.49f)
                curveTo(6f, 1.667f, 6.667f, 1f, 7.49f, 1f)
                close()
                moveTo(16.5f, 5.5f)
                verticalLineTo(2.75f)
                curveTo(16.5f, 2.612f, 16.388f, 2.5f, 16.25f, 2.5f)
                horizontalLineTo(12.75f)
                curveTo(12.612f, 2.5f, 12.5f, 2.612f, 12.5f, 2.75f)
                verticalLineTo(5.5f)
                horizontalLineTo(16.5f)
                close()
                moveTo(7.5f, 2.514f)
                verticalLineTo(5.5f)
                horizontalLineTo(10.453f)
                lineTo(7.5f, 2.514f)
                close()
                moveTo(6.851f, 19.831f)
                curveTo(6.892f, 20.212f, 7.214f, 20.5f, 7.596f, 20.5f)
                horizontalLineTo(16.404f)
                curveTo(16.787f, 20.5f, 17.108f, 20.211f, 17.149f, 19.831f)
                lineTo(18.537f, 7f)
                horizontalLineTo(5.46f)
                lineTo(6.851f, 19.831f)
                close()
                moveTo(11.792f, 10.409f)
                curveTo(11.891f, 10.261f, 12.109f, 10.261f, 12.208f, 10.409f)
                lineTo(12.877f, 11.409f)
                curveTo(13.107f, 11.753f, 13.573f, 11.846f, 13.917f, 11.616f)
                curveTo(14.261f, 11.385f, 14.354f, 10.919f, 14.123f, 10.575f)
                lineTo(13.455f, 9.575f)
                curveTo(12.762f, 8.539f, 11.238f, 8.539f, 10.545f, 9.575f)
                lineTo(9.877f, 10.575f)
                curveTo(9.646f, 10.919f, 9.739f, 11.385f, 10.083f, 11.616f)
                curveTo(10.427f, 11.846f, 10.893f, 11.753f, 11.123f, 11.409f)
                lineTo(11.792f, 10.409f)
                close()
                moveTo(9.636f, 12.599f)
                curveTo(9.991f, 12.812f, 10.106f, 13.273f, 9.893f, 13.628f)
                lineTo(9.529f, 14.235f)
                curveTo(9.329f, 14.568f, 9.569f, 14.992f, 9.958f, 14.992f)
                horizontalLineTo(10.75f)
                curveTo(11.164f, 14.992f, 11.5f, 15.328f, 11.5f, 15.742f)
                curveTo(11.5f, 16.156f, 11.164f, 16.492f, 10.75f, 16.492f)
                horizontalLineTo(9.958f)
                curveTo(8.403f, 16.492f, 7.443f, 14.796f, 8.243f, 13.463f)
                lineTo(8.607f, 12.856f)
                curveTo(8.82f, 12.501f, 9.281f, 12.386f, 9.636f, 12.599f)
                close()
                moveTo(14.109f, 13.628f)
                curveTo(13.896f, 13.272f, 14.012f, 12.812f, 14.367f, 12.599f)
                curveTo(14.722f, 12.386f, 15.183f, 12.501f, 15.396f, 12.857f)
                lineTo(15.76f, 13.464f)
                curveTo(16.558f, 14.797f, 15.598f, 16.492f, 14.044f, 16.492f)
                horizontalLineTo(13.25f)
                curveTo(12.836f, 16.492f, 12.5f, 16.156f, 12.5f, 15.742f)
                curveTo(12.5f, 15.328f, 12.836f, 14.992f, 13.25f, 14.992f)
                horizontalLineTo(14.044f)
                curveTo(14.432f, 14.992f, 14.673f, 14.568f, 14.473f, 14.235f)
                lineTo(14.109f, 13.628f)
                close()
            }
        }.build()

        return _BinRecycleFull!!
    }

@Suppress("ObjectPropertyName")
private var _BinRecycleFull: ImageVector? = null

@Preview
@Composable
private fun BinRecycleFullPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BinRecycleFull, contentDescription = null)
    }
}
