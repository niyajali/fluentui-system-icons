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
 * TagError Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon
 * - Description: Used to represent information tied to specific data.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_tag_error_24_regular.svg)
 * 
 * @return The [ImageVector] for the TagError icon.
 */
public val FluentIcons.Regular.TagError: ImageVector
    get() {
        if (_tagError != null) {
            return _tagError!!
        }
        _tagError = Builder(name = "TagError", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.75f, 2.0f)
                curveTo(20.993f, 2.0f, 22.0f, 3.007f, 22.0f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(22.0f, 10.574f, 21.657f, 11.4f, 21.048f, 12.01f)
                lineTo(21.022f, 12.036f)
                curveTo(20.58f, 11.75f, 20.1f, 11.517f, 19.593f, 11.344f)
                lineTo(19.987f, 10.949f)
                curveTo(20.316f, 10.621f, 20.5f, 10.176f, 20.5f, 9.712f)
                verticalLineTo(4.25f)
                curveTo(20.5f, 3.836f, 20.164f, 3.5f, 19.75f, 3.5f)
                horizontalLineTo(14.285f)
                curveTo(13.82f, 3.5f, 13.375f, 3.685f, 13.046f, 4.013f)
                lineTo(4.534f, 12.536f)
                curveTo(3.864f, 13.221f, 3.869f, 14.319f, 4.549f, 14.998f)
                lineTo(9.01f, 19.452f)
                curveTo(9.648f, 20.088f, 10.653f, 20.131f, 11.341f, 19.583f)
                curveTo(11.505f, 20.069f, 11.725f, 20.529f, 11.994f, 20.957f)
                curveTo(10.737f, 21.757f, 9.05f, 21.61f, 7.951f, 20.514f)
                lineTo(3.489f, 16.059f)
                curveTo(2.219f, 14.791f, 2.217f, 12.733f, 3.485f, 11.463f)
                lineTo(11.985f, 2.953f)
                curveTo(12.595f, 2.343f, 13.422f, 2.0f, 14.285f, 2.0f)
                horizontalLineTo(19.75f)
                close()
                moveTo(17.0f, 5.502f)
                curveTo(17.828f, 5.502f, 18.5f, 6.174f, 18.5f, 7.002f)
                curveTo(18.5f, 7.831f, 17.828f, 8.502f, 17.0f, 8.502f)
                curveTo(16.171f, 8.502f, 15.5f, 7.831f, 15.5f, 7.002f)
                curveTo(15.5f, 6.174f, 16.171f, 5.502f, 17.0f, 5.502f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.538f, 20.537f, 23.0f, 17.5f, 23.0f)
                curveTo(14.462f, 23.0f, 12.0f, 20.538f, 12.0f, 17.5f)
                curveTo(12.0f, 14.462f, 14.462f, 12.0f, 17.5f, 12.0f)
                curveTo(20.537f, 12.0f, 23.0f, 14.462f, 23.0f, 17.5f)
                close()
                moveTo(17.5f, 14.0f)
                curveTo(17.224f, 14.0f, 17.0f, 14.224f, 17.0f, 14.5f)
                verticalLineTo(18.5f)
                curveTo(17.0f, 18.776f, 17.224f, 19.0f, 17.5f, 19.0f)
                curveTo(17.776f, 19.0f, 18.0f, 18.776f, 18.0f, 18.5f)
                verticalLineTo(14.5f)
                curveTo(18.0f, 14.224f, 17.776f, 14.0f, 17.5f, 14.0f)
                close()
                moveTo(17.5f, 21.125f)
                curveTo(17.845f, 21.125f, 18.125f, 20.845f, 18.125f, 20.5f)
                curveTo(18.125f, 20.155f, 17.845f, 19.875f, 17.5f, 19.875f)
                curveTo(17.155f, 19.875f, 16.875f, 20.155f, 16.875f, 20.5f)
                curveTo(16.875f, 20.845f, 17.155f, 21.125f, 17.5f, 21.125f)
                close()
            }
        }
        .build()
        return _tagError!!
    }

@Suppress("ObjectPropertyName")
private var _tagError: ImageVector? = null

@Preview
@Composable
private fun TagErrorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TagError, contentDescription = "TagError Icon")
    }
}

