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
 * LayoutRowTwoFocusTopSettings Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, vscode
 * - Description: Used to represent UI layouts.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_layout_row_two_focus_top_settings_20_filled.svg)
 * 
 * @return The [ImageVector] for the LayoutRowTwoFocusTopSettings icon.
 */
public val FluentIcons.Filled.LayoutRowTwoFocusTopSettings: ImageVector
    get() {
        if (_layoutRowTwoFocusTopSettings != null) {
            return _layoutRowTwoFocusTopSettings!!
        }
        _layoutRowTwoFocusTopSettings = Builder(name = "LayoutRowTwoFocusTopSettings", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(4.343f, 3.0f, 3.0f, 4.343f, 3.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 15.657f, 4.343f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(9.6f)
                curveTo(9.438f, 16.683f, 9.306f, 16.349f, 9.207f, 16.0f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 16.0f, 4.0f, 15.105f, 4.0f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.337f)
                curveTo(12.232f, 9.37f, 13.323f, 9.0f, 14.5f, 9.0f)
                curveTo(15.4f, 9.0f, 16.25f, 9.216f, 17.0f, 9.6f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 4.343f, 15.657f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(12.065f, 11.442f)
                curveTo(12.368f, 12.523f, 11.722f, 13.642f, 10.634f, 13.92f)
                lineTo(10.173f, 14.038f)
                curveTo(10.158f, 14.19f, 10.15f, 14.344f, 10.15f, 14.5f)
                curveTo(10.15f, 14.688f, 10.161f, 14.873f, 10.183f, 15.054f)
                lineTo(10.533f, 15.137f)
                curveTo(11.652f, 15.401f, 12.318f, 16.554f, 11.989f, 17.656f)
                lineTo(11.862f, 18.079f)
                curveTo(12.12f, 18.282f, 12.399f, 18.456f, 12.697f, 18.596f)
                lineTo(13.022f, 18.252f)
                curveTo(13.812f, 17.416f, 15.143f, 17.417f, 15.932f, 18.254f)
                lineTo(16.269f, 18.612f)
                curveTo(16.561f, 18.477f, 16.837f, 18.309f, 17.091f, 18.114f)
                lineTo(16.935f, 17.558f)
                curveTo(16.631f, 16.476f, 17.277f, 15.358f, 18.365f, 15.08f)
                lineTo(18.826f, 14.962f)
                curveTo(18.841f, 14.81f, 18.848f, 14.656f, 18.848f, 14.5f)
                curveTo(18.848f, 14.312f, 18.837f, 14.127f, 18.816f, 13.945f)
                lineTo(18.467f, 13.863f)
                curveTo(17.347f, 13.598f, 16.681f, 12.446f, 17.011f, 11.344f)
                lineTo(17.137f, 10.922f)
                curveTo(16.88f, 10.718f, 16.6f, 10.544f, 16.302f, 10.403f)
                lineTo(15.977f, 10.747f)
                curveTo(15.188f, 11.583f, 13.857f, 11.583f, 13.068f, 10.746f)
                lineTo(12.731f, 10.388f)
                curveTo(12.438f, 10.523f, 12.163f, 10.69f, 11.909f, 10.885f)
                lineTo(12.065f, 11.442f)
                close()
                moveTo(14.499f, 15.5f)
                curveTo(13.947f, 15.5f, 13.499f, 15.052f, 13.499f, 14.5f)
                curveTo(13.499f, 13.948f, 13.947f, 13.5f, 14.499f, 13.5f)
                curveTo(15.052f, 13.5f, 15.499f, 13.948f, 15.499f, 14.5f)
                curveTo(15.499f, 15.052f, 15.052f, 15.5f, 14.499f, 15.5f)
                close()
            }
        }
        .build()
        return _layoutRowTwoFocusTopSettings!!
    }

@Suppress("ObjectPropertyName")
private var _layoutRowTwoFocusTopSettings: ImageVector? = null

@Preview
@Composable
private fun LayoutRowTwoFocusTopSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.LayoutRowTwoFocusTopSettings, contentDescription = "LayoutRowTwoFocusTopSettings Icon")
    }
}

