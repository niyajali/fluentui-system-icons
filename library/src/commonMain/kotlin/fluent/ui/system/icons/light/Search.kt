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

package fluent.ui.system.icons.light

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
 * Search Icon (32dp)
 * 
 * **Icon details:**
 * - Style: Light
 * - Size: 32dp
 * - Keywords: fluent-icon
 * - Description: Used in general search scenarios.â ï¸ Please note, Fluent updates have pushed for unified direction. So no more right leaning magnifying glasses, mmmkay?
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_search_32_light.svg)
 * 
 * @return The [ImageVector] for the Search icon.
 */
public val FluentIcons.Light.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.368f, 6.368f)
                curveTo(10.859f, 1.877f, 18.141f, 1.877f, 22.632f, 6.368f)
                curveTo(27.004f, 10.741f, 27.118f, 17.757f, 22.976f, 22.27f)
                lineTo(29.852f, 29.146f)
                curveTo(30.047f, 29.342f, 30.047f, 29.658f, 29.852f, 29.854f)
                curveTo(29.656f, 30.049f, 29.34f, 30.049f, 29.145f, 29.854f)
                lineTo(22.269f, 22.977f)
                curveTo(17.757f, 27.118f, 10.741f, 27.004f, 6.368f, 22.632f)
                curveTo(1.877f, 18.141f, 1.877f, 10.859f, 6.368f, 6.368f)
                close()
                moveTo(21.925f, 7.075f)
                curveTo(17.824f, 2.975f, 11.176f, 2.975f, 7.075f, 7.075f)
                curveTo(2.975f, 11.176f, 2.975f, 17.824f, 7.075f, 21.925f)
                curveTo(11.176f, 26.025f, 17.824f, 26.025f, 21.925f, 21.925f)
                curveTo(26.025f, 17.824f, 26.025f, 11.176f, 21.925f, 7.075f)
                close()
            }
        }
        .build()
        return _search!!
    }

@Suppress("ObjectPropertyName")
private var _search: ImageVector? = null

@Preview
@Composable
private fun SearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.Search, contentDescription = "Search Icon")
    }
}

