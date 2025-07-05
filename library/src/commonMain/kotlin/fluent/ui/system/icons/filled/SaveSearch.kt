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
 * SaveSearch Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent saving content.â ï¸ Before using review if necessary. Floppy disc is old concept. Try a more dynamic save experience with motion and a checkmark or other UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_save_search_20_filled.svg)
 * 
 * @return The [ImageVector] for the SaveSearch icon.
 */
public val FluentIcons.Filled.SaveSearch: ImageVector
    get() {
        if (_saveSearch != null) {
            return _saveSearch!!
        }
        _saveSearch = Builder(name = "SaveSearch", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                curveTo(3.0f, 3.895f, 3.895f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(6.0f)
                lineTo(6.0f, 6.5f)
                curveTo(6.0f, 7.328f, 6.672f, 8.0f, 7.5f, 8.0f)
                lineTo(11.5f, 8.0f)
                curveTo(12.328f, 8.0f, 13.0f, 7.328f, 13.0f, 6.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.379f)
                curveTo(13.909f, 3.0f, 14.418f, 3.211f, 14.793f, 3.586f)
                lineTo(16.414f, 5.207f)
                curveTo(16.789f, 5.582f, 17.0f, 6.091f, 17.0f, 6.621f)
                verticalLineTo(15.0f)
                curveTo(17.0f, 16.105f, 16.105f, 17.0f, 15.0f, 17.0f)
                verticalLineTo(11.5f)
                curveTo(15.0f, 10.672f, 14.328f, 10.0f, 13.5f, 10.0f)
                horizontalLineTo(9.329f)
                curveTo(7.562f, 8.568f, 4.962f, 8.674f, 3.318f, 10.318f)
                curveTo(3.205f, 10.431f, 3.099f, 10.549f, 3.0f, 10.671f)
                verticalLineTo(5.0f)
                close()
                moveTo(10.562f, 15.44f)
                lineTo(12.121f, 17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.5f)
                curveTo(14.0f, 11.224f, 13.776f, 11.0f, 13.5f, 11.0f)
                horizontalLineTo(10.243f)
                curveTo(11.132f, 12.328f, 11.238f, 14.024f, 10.562f, 15.44f)
                close()
                moveTo(12.0f, 3.0f)
                horizontalLineTo(7.0f)
                lineTo(7.0f, 6.5f)
                curveTo(7.0f, 6.776f, 7.224f, 7.0f, 7.5f, 7.0f)
                lineTo(11.5f, 7.0f)
                curveTo(11.776f, 7.0f, 12.0f, 6.776f, 12.0f, 6.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(10.0f, 13.5f)
                curveTo(10.0f, 14.286f, 9.741f, 15.012f, 9.303f, 15.596f)
                lineTo(11.854f, 18.146f)
                curveTo(12.049f, 18.342f, 12.049f, 18.658f, 11.854f, 18.854f)
                curveTo(11.658f, 19.049f, 11.342f, 19.049f, 11.146f, 18.854f)
                lineTo(8.596f, 16.303f)
                curveTo(8.012f, 16.741f, 7.286f, 17.0f, 6.5f, 17.0f)
                curveTo(4.567f, 17.0f, 3.0f, 15.433f, 3.0f, 13.5f)
                curveTo(3.0f, 11.567f, 4.567f, 10.0f, 6.5f, 10.0f)
                curveTo(8.433f, 10.0f, 10.0f, 11.567f, 10.0f, 13.5f)
                close()
                moveTo(4.0f, 13.5f)
                curveTo(4.0f, 14.881f, 5.119f, 16.0f, 6.5f, 16.0f)
                curveTo(7.881f, 16.0f, 9.0f, 14.881f, 9.0f, 13.5f)
                curveTo(9.0f, 12.119f, 7.881f, 11.0f, 6.5f, 11.0f)
                curveTo(5.119f, 11.0f, 4.0f, 12.119f, 4.0f, 13.5f)
                close()
            }
        }
        .build()
        return _saveSearch!!
    }

@Suppress("ObjectPropertyName")
private var _saveSearch: ImageVector? = null

@Preview
@Composable
private fun SaveSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SaveSearch, contentDescription = "SaveSearch Icon")
    }
}

