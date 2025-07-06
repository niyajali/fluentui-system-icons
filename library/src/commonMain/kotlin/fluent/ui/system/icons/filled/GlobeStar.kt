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

package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * GlobeStar Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in scenarios representing the internet & global representation scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_globe_star_20_filled.svg)
 * 
 * @return The [ImageVector] for the GlobeStar icon.
 */
public val FluentIcons.Filled.GlobeStar: ImageVector
    get() {
        if (_globeStar != null) {
            return _globeStar!!
        }
        _globeStar = Builder(name = "GlobeStar", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.318f, 6.5f)
                curveTo(7.486f, 5.627f, 7.715f, 4.843f, 7.987f, 4.18f)
                curveTo(8.289f, 3.447f, 8.636f, 2.886f, 8.996f, 2.517f)
                curveTo(9.354f, 2.149f, 9.693f, 2.0f, 10.0f, 2.0f)
                curveTo(10.307f, 2.0f, 10.646f, 2.149f, 11.004f, 2.517f)
                curveTo(11.364f, 2.886f, 11.711f, 3.447f, 12.012f, 4.18f)
                curveTo(12.285f, 4.843f, 12.514f, 5.627f, 12.682f, 6.5f)
                horizontalLineTo(7.318f)
                close()
                moveTo(7.063f, 3.799f)
                curveTo(7.3f, 3.222f, 7.577f, 2.707f, 7.891f, 2.281f)
                curveTo(5.651f, 2.892f, 3.803f, 4.451f, 2.804f, 6.5f)
                horizontalLineTo(6.301f)
                curveTo(6.483f, 5.493f, 6.742f, 4.578f, 7.063f, 3.799f)
                close()
                moveTo(12.937f, 3.799f)
                curveTo(12.7f, 3.222f, 12.423f, 2.707f, 12.109f, 2.281f)
                curveTo(14.349f, 2.892f, 16.197f, 4.451f, 17.196f, 6.5f)
                horizontalLineTo(13.699f)
                curveTo(13.517f, 5.493f, 13.258f, 4.578f, 12.937f, 3.799f)
                close()
                moveTo(13.85f, 7.5f)
                horizontalLineTo(17.602f)
                curveTo(17.86f, 8.287f, 18.0f, 9.127f, 18.0f, 10.0f)
                curveTo(18.0f, 10.085f, 17.999f, 10.17f, 17.996f, 10.254f)
                curveTo(17.046f, 9.471f, 15.828f, 9.0f, 14.5f, 9.0f)
                curveTo(14.324f, 9.0f, 14.15f, 9.008f, 13.978f, 9.024f)
                curveTo(13.954f, 8.502f, 13.911f, 7.993f, 13.85f, 7.5f)
                close()
                moveTo(12.985f, 9.211f)
                curveTo(12.962f, 8.619f, 12.913f, 8.046f, 12.842f, 7.5f)
                horizontalLineTo(7.158f)
                curveTo(7.056f, 8.285f, 7.0f, 9.125f, 7.0f, 10.0f)
                curveTo(7.0f, 10.875f, 7.056f, 11.715f, 7.158f, 12.5f)
                horizontalLineTo(9.375f)
                curveTo(9.995f, 10.913f, 11.33f, 9.684f, 12.985f, 9.211f)
                close()
                moveTo(9.091f, 13.5f)
                horizontalLineTo(7.318f)
                curveTo(7.486f, 14.373f, 7.715f, 15.157f, 7.987f, 15.82f)
                curveTo(8.289f, 16.553f, 8.636f, 17.114f, 8.996f, 17.483f)
                curveTo(9.354f, 17.851f, 9.693f, 18.0f, 10.0f, 18.0f)
                curveTo(10.076f, 18.0f, 10.154f, 17.991f, 10.234f, 17.972f)
                curveTo(9.462f, 17.025f, 9.0f, 15.816f, 9.0f, 14.5f)
                curveTo(9.0f, 14.158f, 9.031f, 13.824f, 9.091f, 13.5f)
                close()
                moveTo(2.804f, 13.5f)
                curveTo(3.803f, 15.549f, 5.651f, 17.108f, 7.891f, 17.719f)
                curveTo(7.577f, 17.293f, 7.3f, 16.778f, 7.063f, 16.201f)
                curveTo(6.742f, 15.422f, 6.483f, 14.507f, 6.301f, 13.5f)
                horizontalLineTo(2.804f)
                close()
                moveTo(6.15f, 12.5f)
                horizontalLineTo(2.398f)
                curveTo(2.14f, 11.714f, 2.0f, 10.873f, 2.0f, 10.0f)
                curveTo(2.0f, 9.127f, 2.14f, 8.287f, 2.398f, 7.5f)
                horizontalLineTo(6.15f)
                curveTo(6.052f, 8.295f, 6.0f, 9.134f, 6.0f, 10.0f)
                curveTo(6.0f, 10.866f, 6.052f, 11.705f, 6.15f, 12.5f)
                close()
                moveTo(14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                close()
                moveTo(15.453f, 13.392f)
                horizontalLineTo(16.999f)
                curveTo(17.483f, 13.392f, 17.685f, 14.039f, 17.293f, 14.336f)
                lineTo(16.043f, 15.283f)
                lineTo(16.52f, 16.815f)
                curveTo(16.67f, 17.295f, 16.142f, 17.695f, 15.75f, 17.398f)
                lineTo(14.5f, 16.451f)
                lineTo(13.25f, 17.398f)
                curveTo(12.858f, 17.695f, 12.33f, 17.295f, 12.48f, 16.815f)
                lineTo(12.957f, 15.283f)
                lineTo(11.707f, 14.336f)
                curveTo(11.315f, 14.039f, 11.517f, 13.392f, 12.002f, 13.392f)
                horizontalLineTo(13.547f)
                lineTo(14.024f, 11.861f)
                curveTo(14.174f, 11.38f, 14.826f, 11.38f, 14.976f, 11.861f)
                lineTo(15.453f, 13.392f)
                close()
            }
        }
        .build()
        return _globeStar!!
    }

@Suppress("ObjectPropertyName")
private var _globeStar: ImageVector? = null

@Preview
@Composable
private fun GlobeStarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.GlobeStar, contentDescription = "GlobeStar Icon")
    }
}

