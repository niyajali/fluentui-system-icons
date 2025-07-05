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
 * TagReset Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent information tied to specific data.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tag_reset_24_regular.svg)
 * 
 * @return The [ImageVector] for the TagReset icon.
 */
public val FluentIcons.Regular.TagReset: ImageVector
    get() {
        if (_tagReset != null) {
            return _tagReset!!
        }
        _tagReset = Builder(name = "TagReset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 4.25f)
                curveTo(22.0f, 3.007f, 20.993f, 2.0f, 19.75f, 2.0f)
                horizontalLineTo(14.285f)
                curveTo(13.422f, 2.0f, 12.595f, 2.343f, 11.985f, 2.953f)
                lineTo(3.485f, 11.463f)
                curveTo(2.217f, 12.733f, 2.219f, 14.791f, 3.489f, 16.059f)
                lineTo(7.951f, 20.514f)
                curveTo(9.222f, 21.781f, 11.278f, 21.78f, 12.547f, 20.513f)
                lineTo(12.55f, 20.51f)
                curveTo(12.311f, 19.991f, 12.147f, 19.44f, 12.064f, 18.875f)
                lineTo(11.487f, 19.452f)
                curveTo(10.803f, 20.134f, 9.695f, 20.135f, 9.01f, 19.452f)
                lineTo(4.549f, 14.998f)
                curveTo(3.869f, 14.319f, 3.864f, 13.221f, 4.534f, 12.536f)
                lineTo(13.046f, 4.013f)
                curveTo(13.375f, 3.685f, 13.82f, 3.5f, 14.285f, 3.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 3.5f, 20.5f, 3.836f, 20.5f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(20.5f, 10.176f, 20.316f, 10.621f, 19.987f, 10.949f)
                lineTo(18.873f, 12.064f)
                curveTo(19.439f, 12.147f, 19.989f, 12.311f, 20.508f, 12.55f)
                lineTo(21.048f, 12.01f)
                curveTo(21.657f, 11.4f, 22.0f, 10.574f, 22.0f, 9.712f)
                verticalLineTo(4.25f)
                close()
                moveTo(18.5f, 7.002f)
                curveTo(18.5f, 6.174f, 17.828f, 5.502f, 17.0f, 5.502f)
                curveTo(16.171f, 5.502f, 15.5f, 6.174f, 15.5f, 7.002f)
                curveTo(15.5f, 7.831f, 16.171f, 8.502f, 17.0f, 8.502f)
                curveTo(17.828f, 8.502f, 18.5f, 7.831f, 18.5f, 7.002f)
                close()
                moveTo(14.78f, 12.28f)
                curveTo(15.073f, 11.987f, 15.073f, 11.513f, 14.78f, 11.22f)
                curveTo(14.487f, 10.927f, 14.013f, 10.927f, 13.72f, 11.22f)
                lineTo(11.72f, 13.22f)
                curveTo(11.427f, 13.513f, 11.427f, 13.987f, 11.72f, 14.28f)
                lineTo(13.72f, 16.28f)
                curveTo(14.013f, 16.573f, 14.487f, 16.573f, 14.78f, 16.28f)
                curveTo(15.073f, 15.987f, 15.073f, 15.513f, 14.78f, 15.22f)
                lineTo(14.061f, 14.5f)
                horizontalLineTo(18.0f)
                curveTo(18.692f, 14.5f, 19.369f, 14.705f, 19.944f, 15.09f)
                curveTo(20.52f, 15.474f, 20.969f, 16.021f, 21.234f, 16.661f)
                curveTo(21.499f, 17.3f, 21.568f, 18.004f, 21.433f, 18.683f)
                curveTo(21.298f, 19.362f, 20.964f, 19.985f, 20.475f, 20.475f)
                curveTo(19.985f, 20.964f, 19.362f, 21.298f, 18.683f, 21.433f)
                curveTo(18.004f, 21.568f, 17.3f, 21.499f, 16.661f, 21.234f)
                curveTo(16.021f, 20.969f, 15.474f, 20.52f, 15.09f, 19.944f)
                curveTo(14.705f, 19.369f, 14.5f, 18.692f, 14.5f, 18.0f)
                curveTo(14.5f, 17.586f, 14.164f, 17.25f, 13.75f, 17.25f)
                curveTo(13.336f, 17.25f, 13.0f, 17.586f, 13.0f, 18.0f)
                curveTo(13.0f, 18.989f, 13.293f, 19.956f, 13.843f, 20.778f)
                curveTo(14.392f, 21.6f, 15.173f, 22.241f, 16.087f, 22.619f)
                curveTo(17.0f, 22.998f, 18.006f, 23.097f, 18.976f, 22.904f)
                curveTo(19.945f, 22.711f, 20.836f, 22.235f, 21.535f, 21.535f)
                curveTo(22.235f, 20.836f, 22.711f, 19.945f, 22.904f, 18.976f)
                curveTo(23.097f, 18.006f, 22.998f, 17.0f, 22.619f, 16.087f)
                curveTo(22.241f, 15.173f, 21.6f, 14.392f, 20.778f, 13.843f)
                curveTo(19.956f, 13.293f, 18.989f, 13.0f, 18.0f, 13.0f)
                horizontalLineTo(14.061f)
                lineTo(14.78f, 12.28f)
                close()
            }
        }
        .build()
        return _tagReset!!
    }

@Suppress("ObjectPropertyName")
private var _tagReset: ImageVector? = null

@Preview
@Composable
private fun TagResetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TagReset, contentDescription = "TagReset Icon")
    }
}

