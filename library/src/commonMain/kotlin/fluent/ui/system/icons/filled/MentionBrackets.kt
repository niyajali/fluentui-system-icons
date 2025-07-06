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
 * MentionBrackets Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent specific targeting of mentions in UI.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_mention_brackets_20_filled.svg)
 * 
 * @return The [ImageVector] for the MentionBrackets icon.
 */
public val FluentIcons.Filled.MentionBrackets: ImageVector
    get() {
        if (_mentionBrackets != null) {
            return _mentionBrackets!!
        }
        _mentionBrackets = Builder(name = "MentionBrackets", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.75f, 2.0f)
                curveTo(3.231f, 2.0f, 2.0f, 3.231f, 2.0f, 4.75f)
                verticalLineTo(15.25f)
                curveTo(2.0f, 16.769f, 3.231f, 18.0f, 4.75f, 18.0f)
                horizontalLineTo(6.25f)
                curveTo(6.664f, 18.0f, 7.0f, 17.664f, 7.0f, 17.25f)
                curveTo(7.0f, 16.836f, 6.664f, 16.5f, 6.25f, 16.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 16.5f, 3.5f, 15.94f, 3.5f, 15.25f)
                verticalLineTo(4.75f)
                curveTo(3.5f, 4.06f, 4.06f, 3.5f, 4.75f, 3.5f)
                horizontalLineTo(6.25f)
                curveTo(6.664f, 3.5f, 7.0f, 3.164f, 7.0f, 2.75f)
                curveTo(7.0f, 2.336f, 6.664f, 2.0f, 6.25f, 2.0f)
                horizontalLineTo(4.75f)
                close()
                moveTo(11.75f, 7.25f)
                curveTo(12.164f, 7.25f, 12.5f, 7.586f, 12.5f, 8.0f)
                verticalLineTo(10.75f)
                curveTo(12.5f, 11.164f, 12.836f, 11.5f, 13.25f, 11.5f)
                curveTo(13.664f, 11.5f, 14.0f, 11.164f, 14.0f, 10.75f)
                verticalLineTo(10.0f)
                curveTo(14.0f, 7.791f, 12.209f, 6.0f, 10.0f, 6.0f)
                curveTo(7.791f, 6.0f, 6.0f, 7.791f, 6.0f, 10.0f)
                curveTo(6.0f, 12.129f, 7.663f, 13.87f, 9.762f, 13.993f)
                lineTo(9.757f, 14.0f)
                lineTo(9.769f, 13.993f)
                curveTo(9.846f, 13.998f, 9.923f, 14.0f, 10.0f, 14.0f)
                curveTo(10.377f, 14.0f, 10.721f, 13.958f, 11.05f, 13.868f)
                curveTo(11.404f, 13.771f, 11.799f, 13.918f, 11.935f, 14.258f)
                curveTo(12.107f, 14.688f, 11.914f, 15.185f, 11.468f, 15.309f)
                curveTo(11.006f, 15.438f, 10.523f, 15.5f, 10.0f, 15.5f)
                curveTo(6.962f, 15.5f, 4.5f, 13.038f, 4.5f, 10.0f)
                curveTo(4.5f, 6.962f, 6.962f, 4.5f, 10.0f, 4.5f)
                curveTo(13.038f, 4.5f, 15.5f, 6.962f, 15.5f, 10.0f)
                verticalLineTo(10.75f)
                curveTo(15.5f, 11.206f, 15.364f, 11.631f, 15.131f, 11.986f)
                curveTo(15.09f, 12.09f, 15.047f, 12.193f, 15.0f, 12.295f)
                verticalLineTo(12.164f)
                curveTo(14.587f, 12.674f, 13.957f, 13.0f, 13.25f, 13.0f)
                curveTo(12.495f, 13.0f, 11.828f, 12.628f, 11.419f, 12.058f)
                curveTo(11.016f, 12.337f, 10.527f, 12.5f, 10.0f, 12.5f)
                curveTo(8.619f, 12.5f, 7.5f, 11.381f, 7.5f, 10.0f)
                curveTo(7.5f, 8.619f, 8.619f, 7.5f, 10.0f, 7.5f)
                curveTo(10.375f, 7.5f, 10.731f, 7.583f, 11.05f, 7.73f)
                curveTo(11.158f, 7.449f, 11.431f, 7.25f, 11.75f, 7.25f)
                close()
                moveTo(10.0f, 9.0f)
                curveTo(9.448f, 9.0f, 9.0f, 9.448f, 9.0f, 10.0f)
                curveTo(9.0f, 10.552f, 9.448f, 11.0f, 10.0f, 11.0f)
                curveTo(10.552f, 11.0f, 11.0f, 10.552f, 11.0f, 10.0f)
                curveTo(11.0f, 9.448f, 10.552f, 9.0f, 10.0f, 9.0f)
                close()
                moveTo(18.0f, 4.75f)
                curveTo(18.0f, 3.231f, 16.769f, 2.0f, 15.25f, 2.0f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 2.0f, 13.0f, 2.336f, 13.0f, 2.75f)
                curveTo(13.0f, 3.164f, 13.336f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(15.25f)
                curveTo(15.94f, 3.5f, 16.5f, 4.06f, 16.5f, 4.75f)
                verticalLineTo(15.25f)
                curveTo(16.5f, 15.94f, 15.94f, 16.5f, 15.25f, 16.5f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 16.5f, 13.0f, 16.836f, 13.0f, 17.25f)
                curveTo(13.0f, 17.664f, 13.336f, 18.0f, 13.75f, 18.0f)
                horizontalLineTo(15.25f)
                curveTo(16.769f, 18.0f, 18.0f, 16.769f, 18.0f, 15.25f)
                verticalLineTo(4.75f)
                close()
            }
        }
        .build()
        return _mentionBrackets!!
    }

@Suppress("ObjectPropertyName")
private var _mentionBrackets: ImageVector? = null

@Preview
@Composable
private fun MentionBracketsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MentionBrackets, contentDescription = "MentionBrackets Icon")
    }
}

