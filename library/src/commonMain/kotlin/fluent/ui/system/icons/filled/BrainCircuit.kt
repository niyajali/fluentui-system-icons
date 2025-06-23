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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.BrainCircuit: ImageVector
    get() {
        if (_BrainCircuit != null) {
            return _BrainCircuit!!
        }
        _BrainCircuit = ImageVector.Builder(
            name = "Filled.BrainCircuit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.5f, 2f)
                curveTo(10.144f, 2f, 10.745f, 2.188f, 11.25f, 2.512f)
                verticalLineTo(7.25f)
                horizontalLineTo(9.854f)
                curveTo(9.557f, 6.517f, 8.839f, 6f, 8f, 6f)
                curveTo(6.895f, 6f, 6f, 6.895f, 6f, 8f)
                curveTo(6f, 9.105f, 6.895f, 10f, 8f, 10f)
                curveTo(8.839f, 10f, 9.557f, 9.483f, 9.854f, 8.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(21.245f)
                curveTo(10.621f, 21.718f, 9.84f, 22f, 8.994f, 22f)
                curveTo(7.268f, 22f, 5.799f, 20.813f, 5.367f, 19.199f)
                curveTo(3.459f, 18.896f, 2f, 17.244f, 2f, 15.25f)
                verticalLineTo(15f)
                curveTo(2f, 14.053f, 2.33f, 13.185f, 2.88f, 12.5f)
                horizontalLineTo(6.5f)
                curveTo(6.888f, 12.5f, 7.207f, 12.795f, 7.246f, 13.173f)
                lineTo(7.25f, 13.25f)
                verticalLineTo(13.646f)
                curveTo(6.517f, 13.943f, 6f, 14.661f, 6f, 15.5f)
                curveTo(6f, 16.605f, 6.895f, 17.5f, 8f, 17.5f)
                curveTo(9.105f, 17.5f, 10f, 16.605f, 10f, 15.5f)
                curveTo(10f, 14.661f, 9.483f, 13.943f, 8.75f, 13.646f)
                verticalLineTo(13.25f)
                lineTo(8.738f, 13.019f)
                curveTo(8.623f, 11.885f, 7.665f, 11f, 6.5f, 11f)
                horizontalLineTo(3.814f)
                curveTo(3.304f, 10.344f, 3f, 9.52f, 3f, 8.625f)
                curveTo(3f, 6.686f, 4.423f, 5.08f, 6.282f, 4.795f)
                curveTo(6.504f, 3.215f, 7.86f, 2f, 9.5f, 2f)
                close()
                moveTo(14.5f, 2f)
                curveTo(16.14f, 2f, 17.496f, 3.215f, 17.718f, 4.795f)
                curveTo(19.576f, 5.08f, 21f, 6.686f, 21f, 8.625f)
                curveTo(21f, 9.728f, 20.538f, 10.722f, 19.799f, 11.428f)
                curveTo(21.104f, 12.086f, 22f, 13.438f, 22f, 15f)
                verticalLineTo(15.25f)
                curveTo(22f, 17.244f, 20.541f, 18.896f, 18.633f, 19.199f)
                curveTo(18.201f, 20.813f, 16.732f, 22f, 15.006f, 22f)
                curveTo(14.16f, 22f, 13.379f, 21.718f, 12.75f, 21.245f)
                verticalLineTo(16.5f)
                horizontalLineTo(14.5f)
                curveTo(15.743f, 16.5f, 16.75f, 15.493f, 16.75f, 14.25f)
                verticalLineTo(13.352f)
                curveTo(17.483f, 13.056f, 18f, 12.339f, 18f, 11.5f)
                curveTo(18f, 10.395f, 17.105f, 9.5f, 16f, 9.5f)
                curveTo(14.895f, 9.5f, 14f, 10.395f, 14f, 11.5f)
                curveTo(14f, 12.339f, 14.517f, 13.056f, 15.25f, 13.352f)
                verticalLineTo(14.25f)
                curveTo(15.25f, 14.664f, 14.914f, 15f, 14.5f, 15f)
                horizontalLineTo(12.75f)
                verticalLineTo(2.512f)
                curveTo(13.255f, 2.188f, 13.856f, 2f, 14.5f, 2f)
                close()
                moveTo(8f, 15f)
                curveTo(8.276f, 15f, 8.5f, 15.224f, 8.5f, 15.5f)
                curveTo(8.5f, 15.776f, 8.276f, 16f, 8f, 16f)
                curveTo(7.724f, 16f, 7.5f, 15.776f, 7.5f, 15.5f)
                curveTo(7.5f, 15.224f, 7.724f, 15f, 8f, 15f)
                close()
                moveTo(16f, 11f)
                curveTo(16.276f, 11f, 16.5f, 11.224f, 16.5f, 11.5f)
                curveTo(16.5f, 11.776f, 16.276f, 12f, 16f, 12f)
                curveTo(15.724f, 12f, 15.5f, 11.776f, 15.5f, 11.5f)
                curveTo(15.5f, 11.224f, 15.724f, 11f, 16f, 11f)
                close()
                moveTo(8f, 7.5f)
                curveTo(8.276f, 7.5f, 8.5f, 7.724f, 8.5f, 8f)
                curveTo(8.5f, 8.276f, 8.276f, 8.5f, 8f, 8.5f)
                curveTo(7.724f, 8.5f, 7.5f, 8.276f, 7.5f, 8f)
                curveTo(7.5f, 7.724f, 7.724f, 7.5f, 8f, 7.5f)
                close()
            }
        }.build()

        return _BrainCircuit!!
    }

@Suppress("ObjectPropertyName")
private var _BrainCircuit: ImageVector? = null

@Preview
@Composable
private fun BrainCircuitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BrainCircuit, contentDescription = null)
    }
}
