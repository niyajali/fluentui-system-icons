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
 * TagSearch Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent information tied to specific data.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tag_search_24_regular.svg)
 * 
 * @return The [ImageVector] for the TagSearch icon.
 */
public val FluentIcons.Regular.TagSearch: ImageVector
    get() {
        if (_tagSearch != null) {
            return _tagSearch!!
        }
        _tagSearch = Builder(name = "TagSearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 4.25f)
                curveTo(22.0f, 3.007f, 20.993f, 2.0f, 19.75f, 2.0f)
                horizontalLineTo(14.285f)
                curveTo(13.422f, 2.0f, 12.595f, 2.343f, 11.985f, 2.953f)
                lineTo(3.485f, 11.463f)
                curveTo(2.217f, 12.733f, 2.219f, 14.791f, 3.489f, 16.059f)
                lineTo(7.951f, 20.514f)
                curveTo(9.222f, 21.781f, 11.278f, 21.78f, 12.547f, 20.513f)
                lineTo(12.641f, 20.419f)
                curveTo(12.281f, 20.065f, 11.97f, 19.662f, 11.719f, 19.22f)
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
                lineTo(19.219f, 11.718f)
                curveTo(19.66f, 11.969f, 20.064f, 12.281f, 20.418f, 12.64f)
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
                moveTo(20.168f, 19.107f)
                curveTo(20.692f, 18.372f, 21.0f, 17.472f, 21.0f, 16.5f)
                curveTo(21.0f, 14.015f, 18.985f, 12.0f, 16.5f, 12.0f)
                curveTo(14.015f, 12.0f, 12.0f, 14.015f, 12.0f, 16.5f)
                curveTo(12.0f, 18.985f, 14.015f, 21.0f, 16.5f, 21.0f)
                curveTo(17.472f, 21.0f, 18.372f, 20.692f, 19.107f, 20.168f)
                lineTo(21.72f, 22.78f)
                curveTo(22.013f, 23.073f, 22.487f, 23.073f, 22.78f, 22.78f)
                curveTo(23.073f, 22.487f, 23.073f, 22.013f, 22.78f, 21.72f)
                lineTo(20.168f, 19.107f)
                close()
                moveTo(19.5f, 16.5f)
                curveTo(19.5f, 18.157f, 18.157f, 19.5f, 16.5f, 19.5f)
                curveTo(14.843f, 19.5f, 13.5f, 18.157f, 13.5f, 16.5f)
                curveTo(13.5f, 14.843f, 14.843f, 13.5f, 16.5f, 13.5f)
                curveTo(18.157f, 13.5f, 19.5f, 14.843f, 19.5f, 16.5f)
                close()
            }
        }
        .build()
        return _tagSearch!!
    }

@Suppress("ObjectPropertyName")
private var _tagSearch: ImageVector? = null

@Preview
@Composable
private fun TagSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TagSearch, contentDescription = "TagSearch Icon")
    }
}

