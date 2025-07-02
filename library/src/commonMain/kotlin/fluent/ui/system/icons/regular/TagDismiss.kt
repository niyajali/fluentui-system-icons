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
 * TagDismiss icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: tag, dismiss
 * - Source: ic_fluent_tag_dismiss_24_regular.svg
 * 
 * @return The [ImageVector] for the TagDismiss icon.
 */
public val FluentIcons.Regular.TagDismiss: ImageVector
    get() {
        if (_tagDismiss != null) {
            return _tagDismiss!!
        }
        _tagDismiss = Builder(name = "TagDismiss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveTo(9.648f, 20.088f, 10.653f, 20.131f, 11.341f, 19.582f)
                curveTo(11.505f, 20.069f, 11.726f, 20.529f, 11.994f, 20.956f)
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
                moveTo(17.5f, 23.0f)
                curveTo(20.538f, 23.0f, 23.0f, 20.538f, 23.0f, 17.5f)
                curveTo(23.0f, 14.462f, 20.538f, 12.0f, 17.5f, 12.0f)
                curveTo(14.462f, 12.0f, 12.0f, 14.462f, 12.0f, 17.5f)
                curveTo(12.0f, 20.538f, 14.462f, 23.0f, 17.5f, 23.0f)
                close()
                moveTo(15.146f, 15.146f)
                curveTo(15.342f, 14.951f, 15.658f, 14.951f, 15.854f, 15.146f)
                lineTo(17.5f, 16.793f)
                lineTo(19.146f, 15.146f)
                curveTo(19.342f, 14.951f, 19.658f, 14.951f, 19.854f, 15.146f)
                curveTo(20.049f, 15.342f, 20.049f, 15.658f, 19.854f, 15.854f)
                lineTo(18.207f, 17.5f)
                lineTo(19.854f, 19.146f)
                curveTo(20.049f, 19.342f, 20.049f, 19.658f, 19.854f, 19.854f)
                curveTo(19.658f, 20.049f, 19.342f, 20.049f, 19.146f, 19.854f)
                lineTo(17.5f, 18.207f)
                lineTo(15.854f, 19.854f)
                curveTo(15.658f, 20.049f, 15.342f, 20.049f, 15.146f, 19.854f)
                curveTo(14.951f, 19.658f, 14.951f, 19.342f, 15.146f, 19.146f)
                lineTo(16.793f, 17.5f)
                lineTo(15.146f, 15.854f)
                curveTo(14.951f, 15.658f, 14.951f, 15.342f, 15.146f, 15.146f)
                close()
            }
        }
        .build()
        return _tagDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _tagDismiss: ImageVector? = null

@Preview
@Composable
private fun TagDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TagDismiss, contentDescription = null)
    }
}

